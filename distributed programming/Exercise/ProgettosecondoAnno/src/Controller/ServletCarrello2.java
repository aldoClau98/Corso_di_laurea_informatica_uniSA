package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;

@WebServlet("/ServletCarrello2")
public class ServletCarrello2 extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

	public ServletCarrello2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Utenti u;
		HttpSession session = request.getSession();

		if ((request.getParameter("prodId")) == null) {// se il prodotto è null

			if ((u = (Utenti) request.getSession().getAttribute("utente")) != null) {// se l'utente è loggato mi prendo
																						// il carrello nel database

				System.out.println("accesso  al  utente loggato senza prodotto");

				ArrayList<Prodotti> listaProdottiCarrello = new CarrelloDAO().doRetrieveByCliente(u.getIDutenti());
				session.setAttribute("carrello", listaProdottiCarrello);

				RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
				view.forward(request, response);

			} else {
				// NON LOGGATO
				if (session.getAttribute("carrello") == null) { // altrimenti creao un nuovo arrayList e lo aggiungo
																// alla sessione

					System.out.println("utente non loggato");

					ArrayList<Prodotti> listaProdottiCarrello = new ArrayList<Prodotti>();

					session.setAttribute("carrello", listaProdottiCarrello);
					RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
					view.forward(request, response);
				} else {
					System.out.println("utente non loggato");
					// sessione ancora valida
					ArrayList<Prodotti> listaProdottiCarrello = (ArrayList<Prodotti>) session.getAttribute("carrello");

					session.setAttribute("carrello", listaProdottiCarrello);
					RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
					view.forward(request, response);
				}
			}

		} else {

			// utente loggato con prodotto
			System.out.println("utente loggato  con  prodotto ");
			int idProdotto;
			idProdotto = Integer.parseInt(request.getParameter("prodId"));
			int numProd;
			numProd = Integer.parseInt(request.getParameter("numProd"));

			System.out.println("num prodotto: " + numProd);
			if ((u = (Utenti) request.getSession().getAttribute("utente")) != null) {

				int idUtente = Integer.parseInt(u.getIDutenti());
				Carrello idcarrello = new CarrelloDAO().getCarrelloByUtente(idUtente);
				ArrayList<Prodotti> listaProdottiCarrello = new CarrelloDAO().doRetrieveByCliente(u.getIDutenti());

				Prodotti b = new CarrelloDAO().doRetrieveByCarrello(idProdotto); // restituisco il prodotto da inserire

				System.out.println(b.toString());
				/*
				 * faccio 2 controlli 1= se il prodotto esiste nel mio carrello aggiorno solo la
				 * quantità 2= se il prodotto non esiste nel carrello lo aggiungo
				 */

				boolean trovato = false;

				/* Primo caso */

				for (int i = 0; i < (listaProdottiCarrello.size()); i++) {

					int x = listaProdottiCarrello.get(i).getIDprodotto();

					if (b.getIDprodotto() == x) {
						System.out.println("porcodio");
						int quantita = listaProdottiCarrello.get(i).getQuantitacarrello();// mi prendo la quantita nel
																							// carrello
						quantita += numProd;
						listaProdottiCarrello.get(i).setQuantitacarrello(quantita);// incremento al quantita

						new CarrelloDAO().UpdateQuantita(idUtente, x, quantita);// la salvo nel DB
						trovato = true;
						break;
					}
				}
				/* Secondo caso */
				if (trovato == false) // se non sta nel carrello lo aggiungo anche nel DB
				{
					b.setQuantitacarrello(numProd);
					listaProdottiCarrello.add(b);

					new CarrelloDAO().doSave(idUtente, idProdotto, numProd, idcarrello.getIdcarrello());
				}
				session.setAttribute("carrello", listaProdottiCarrello);
				RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
				view.forward(request, response);
			} else {
				// se non è loggato ma il form è valido

				if (request.getSession().getAttribute("carrello") != null) {
					// prendo il prodotto selezionato e dalla sessione il carrello già esistente
					Prodotti b = new CarrelloDAO().doRetrieveByCarrello(idProdotto);
					ArrayList<Prodotti> listaProdottiCarrello = (ArrayList<Prodotti>) request.getSession()
							.getAttribute("carrello");

					/*
					 * come prima primo caso: prodotto trovato nel carrello secondo caso: prodtto
					 * non trovato
					 */
					boolean trovato = false;
					for (int i = 0; i < listaProdottiCarrello.size(); i++) {
						int x = listaProdottiCarrello.get(i).getIDprodotto();
						if (b.getIDprodotto() == x) {
							int quantita = listaProdottiCarrello.get(i).getQuantitacarrello();
							quantita += numProd;
							listaProdottiCarrello.get(i).setQuantitacarrello(quantita);
							trovato = true;
							break;
						}
					}
					if (trovato == false) {
						b.setQuantitacarrello(numProd);
						listaProdottiCarrello.add(b);

					}
					session.setAttribute("carrello", listaProdottiCarrello);
					RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
					view.forward(request, response);
				} else {

					Prodotti b = new CarrelloDAO().doRetrieveByCarrello(idProdotto);
					b.setQuantitacarrello(numProd);
					ArrayList<Prodotti> listaProdottiCarrello = new ArrayList<Prodotti>();
					listaProdottiCarrello.add(b);

					session.setAttribute("carrello", listaProdottiCarrello);
					RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
					view.forward(request, response);
				}

			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
