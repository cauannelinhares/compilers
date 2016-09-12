package parser;


/**
 * This class contains codes for each grammar terminal
 * @version 2010-september-04
 * @discipline Compiladores
 * @author Gustavo H P Carvalho
 * @email gustavohpcarvalho@ecomp.poli.br
 */
public class GrammarSymbols {

	// Language terminals (starts from 0)
	public static final int ID = 0; 	// [A-Z a-z] followed or not by [0-9]
	public static final int NUM = 1;	// [0-9]+
	public static final int SC = 2; 	// ;
	public static final int COM = 3;	// ,
	public static final int RP = 4;		// (
	public static final int LP = 5;		// )
	public static final int COL = 6;	// :
	public static final int ATR = 7;	// := 
	public static final int DOT = 8;	// .
	public static final int GT = 9;		// >
	public static final int GTE = 10;	// >=
	public static final int MUL = 11;	// *
	public static final int DIV = 12;	// /
	public static final int ADD = 13;	// +
	public static final int SUB = 14;	// -
	public static final int EQL = 15;	// =
	public static final int LT = 16;	// <
	public static final int LTE = 17;	// <=
	public static final int DIFF = 18;	// <>
	
	public static final int PRG = 19;	// program
	public static final int IF = 20;	// if
	public static final int THEN = 21;	// then
	public static final int ELSE = 22;	// else
	public static final int BGN = 23; 	// begin
	public static final int END = 24;	// end
	public static final int WHL = 25;	// while
	public static final int DO = 26;	// do
	public static final int WRT = 27;	// write
	public static final int INT = 28;	// integer
	public static final int BOOL = 29;	// boolean
	public static final int TRUE = 30;	// true
	public static final int FLSE = 31;	// false
	public static final int CTN = 32;	// continue
	public static final int BRK = 33;	// break
	public static final int FUNC = 34;	// function
	public static final int PROC = 35;	// procedure
	public static final int VAR = 36;	// var
	
	//TODO
	public static final int EOT = 1000;
	
}
