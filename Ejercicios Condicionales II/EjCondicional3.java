package EjCondicional2;

import javax.swing.JOptionPane;

public class EjCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variable y introducción de valor
		String nombre = JOptionPane.showInputDialog("Nombre del trabajador");
		int HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));
		double PagoHora = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
		double SueldoBruto = 0, imp = 0, SaldoNeto = 0, HoraExtra;

		// Condición para calcular el salario bruto
		if (HorasTrabajadas > 35) {
			double TarifaNormal = 35 * PagoHora;
			HoraExtra = HorasTrabajadas - 35;
			double SueldoExtra = HoraExtra * (PagoHora * 1.5);
			SueldoBruto = SueldoExtra + TarifaNormal;
		} else {
			SueldoBruto = HorasTrabajadas * PagoHora;
		}

		// Condición para calcular los impuestos
		if (SueldoBruto > 500) {
			HoraExtra = SueldoBruto - 500;
			if (HoraExtra > 400) {
				double imp1 = 400 * 0.25;
				double imp2 = SueldoBruto - 900;
				imp2 = imp2 * 0.45;
				imp = imp1 + imp2;
				SaldoNeto = SueldoBruto - imp;
			} else {
				imp = HoraExtra * 0.25;
				SaldoNeto = SueldoBruto - imp;
			}
		} else {
			imp = 0;
			SaldoNeto = SueldoBruto - imp;
		}

		// Salida mensaje
		JOptionPane.showMessageDialog(null, "Trabajador: " + nombre + ", Sueldo bruto: " + SueldoBruto + ", Impuestos: "
				+ imp + ", Sueldo neto: " + SaldoNeto);

	}

}
