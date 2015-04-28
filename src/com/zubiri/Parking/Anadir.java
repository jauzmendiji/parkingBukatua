package com.zubiri.Parking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zubiri.parking.*;

import java.util.*;

/**
 * Servlet implementation class Anadir
 */
public class Anadir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Anadir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//Scanner sc = null;
		Coche coche = new Coche(null, 0, null, null, false, 0);
		
		
		String matricula = request.getParameter("matricula");
		String marca = request.getParameter("marca");
		String combus = request.getParameter("combustible");
		int consumo = Integer.parseInt(request.getParameter("consumo"));
		boolean auto = Boolean.valueOf(request.getParameter("automatico"));
		int ruedas = Integer.parseInt(request.getParameter("ruedas"));
		
		/*
		String matricula = coche.setMatricula(request.getParameter("matricula"));
		String marca = coche.setMarca(request.getParameter("marca"));
		String combus = coche.setCombustible(request.getParameter("combustible"));
		int consumo = coche.setConsumo100km(Integer.parseInt(request.getParameter("consumo")));
		boolean auto = coche.setAutomatico(Boolean.valueOf(request.getParameter("automatico")));
		int ruedas = coche.setNumRuedas(Integer.parseInt(request.getParameter("ruedas")));*/
		
		//coche.coche(matricula, ruedas, combus, marca, auto, consumo);
		//ParkingVehiculos parking = new ParkingVehiculos(ArrayList<Vehiculo> vehiculos);
		
		coche.setMatricula(matricula);
		coche.setMarca(marca);
		coche.setCombustible(combus);
		coche.setConsumo100km(consumo);
		coche.setAutomatico(auto);
		coche.setNumRuedas(ruedas);
		ParkingVehiculos.parkingvehiculos.add(coche);
		
		
		
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("DATOS:<hr>");
		out.println("Matrícula: " + coche.getMatricula() + "<br>");
		out.println("Marca: " + coche.getMarca() + "<br>");
		out.println("Combustible: " + coche.getCombustible() + "<br>");
		out.println("Consumo: " + coche.getConsumo100km() + "<br>");
		out.println("Automático: " + coche.getAutomatico() + "<br>");
		out.println("Número de ruedas: " + coche.getNumRuedas() + "<br>");
		/*out.println("Matrícula: " + matricula + "<br>");
		out.println("Marca: " + marca + "<br>");
		out.println("Combustible: " + combus + "<br>");
		out.println("Consumo: " + consumo + "<br>");
		out.println("Automático: " + auto + "<br>");
		out.println("Número de ruedas: " + ruedas + "<br>");*/
		out.println("<a href='index.html'><input type='button' value='Volver'></a>");
		out.println("</body></html>");
	}

}
