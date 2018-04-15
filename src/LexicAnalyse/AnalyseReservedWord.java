package LexicAnalyse;

import java.util.HashMap;
import java.util.Map;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseReservedWord extends AnalyseContract {

	// Estados do Automato Finito Deterministico
	private Map<Integer, State> states;

	//construtor
	public AnalyseReservedWord() {
		states = new HashMap<>();

		State q0 = new State(false);
		q0.addTransition('a', 1);
		q0.addTransition('b', 4);
		q0.addTransition('c', 8);
		q0.addTransition('d', 20);
		q0.addTransition('e', 30);
		q0.addTransition('f', 39);
		q0.addTransition('g', 44);
		q0.addTransition('i', 47);
		q0.addTransition('l', 49);
		q0.addTransition('r', 52);
		q0.addTransition('s', 62);
		q0.addTransition('t', 81);
		q0.addTransition('u', 87);
		q0.addTransition('v', 96);
		q0.addTransition('w', 104);
		states.put(0, q0);

		//A
		State q1 = new State(false);
		q1.addTransition('u', 2);
		states.put(1, q1);
		//auto
		State q2 = new State(false);
		q2.addTransition('t', 3);
		states.put(2, q2);
		//auto
		State q3 = new State(false);
		q3.addTransition('o', 120);
		states.put(3, q3);

		//B
		State q4 = new State(false);
		q4.addTransition('r', 5);
		states.put(4, q4);
		//break
		State q5 = new State(false);
		q5.addTransition('e', 6);
		states.put(5, q5);
		//break
		State q6 = new State(false);
		q6.addTransition('a', 7);
		states.put(6, q6);
		//break
		State q7 = new State(false);
		q7.addTransition('k', 120);
		states.put(7, q7);

		//C
		State q8 = new State(false);
		q8.addTransition('a', 9);
		q8.addTransition('h', 11);
		q8.addTransition('o', 13);
		states.put(8, q8);
		//case
		State q9 = new State(false);
		q9.addTransition('s', 10);
		states.put(9, q9);
		//case
		State q10 = new State(false);
		q10.addTransition('e', 120);
		states.put(10, q10);
		//char
		State q11 = new State(false);
		q11.addTransition('a', 12);
		states.put(11, q11);
		//char
		State q12 = new State(false);
		q12.addTransition('r', 120);
		states.put(12, q12);
		//con...
		State q13 = new State(false);
		q13.addTransition('n', 14);
		states.put(13, q13);
		//cons.../cont...
		State q14 = new State(false);
		q14.addTransition('t', 15);
		q14.addTransition('s', 19);
		states.put(14, q14);
		//continue
		State q15 = new State(false);
		q15.addTransition('i', 16);
		states.put(15, q15);
		//continue
		State q16 = new State(false);
		q16.addTransition('n', 17);
		states.put(16, q16);
		//continue
		State q17 = new State(false);
		q17.addTransition('u', 18);
		states.put(17, q17);
		//continue
		State q18 = new State(false);
		q18.addTransition('e', 120);
		states.put(18, q18);
		//const
		State q19 = new State(false);
		q19.addTransition('t', 120);
		states.put(19, q19);

		//D
		State q20 = new State(false);
		q20.addTransition('e', 21);
		q20.addTransition('o', 26);
		states.put(20, q20);
		//default
		State q21 = new State(false);
		q21.addTransition('f', 22);
		states.put(21, q21);
		//default
		State q22 = new State(false);
		q22.addTransition('a', 23);
		states.put(22, q22);
		//default
		State q23 = new State(false);
		q23.addTransition('u', 24);
		states.put(23, q23);
		//default
		State q24 = new State(false);
		q24.addTransition('l', 25);
		states.put(24, q24);
		//default
		State q25 = new State(false);
		q25.addTransition('t', 120);
		states.put(25, q25);
		//do/double
		State q26 = new State(false);
		q26.addTransition('$', 120);
		q26.addTransition('u', 27);
		states.put(26, q26);
		//double
		State q27 = new State(false);
		q27.addTransition('b', 28);
		states.put(27, q27);
		//double
		State q28 = new State(false);
		q28.addTransition('l', 29);
		states.put(28, q28);
		//double
		State q29 = new State(false);
		q29.addTransition('e', 120);
		states.put(29, q29);

		//E
		State q30 = new State(false);
		q30.addTransition('l', 31);
		q30.addTransition('n', 33);
		q30.addTransition('x', 35);
		states.put(30, q30);
		//else
		State q31 = new State(false);
		q31.addTransition('s', 32);
		states.put(31, q31);
		//else
		State q32 = new State(false);
		q32.addTransition('e', 33);
		states.put(32, q32);
		//enum
		State q33 = new State(false);
		q33.addTransition('u', 34);
		states.put(33, q33);
		//enum
		State q34 = new State(false);
		q34.addTransition('m', 120);
		states.put(34, q34);
		//extern
		State q35 = new State(false);
		q35.addTransition('t', 36);
		states.put(35, q35);
		//extern
		State q36 = new State(false);
		q36.addTransition('e', 37);
		states.put(36, q36);
		//extern
		State q37 = new State(false);
		q37.addTransition('r', 38);
		states.put(37, q37);
		//extern
		State q38 = new State(false);
		q38.addTransition('n', 120);
		states.put(38, q38);

		//F
		State q39 = new State(false);
		q39.addTransition('o', 40);
		q39.addTransition('l', 41);
		states.put(39, q39);
		//for
		State q40 = new State(false);
		q40.addTransition('r', 120);
		states.put(40, q40);
		//float
		State q41 = new State(false);
		q41.addTransition('o', 42);
		states.put(41, q41);
		//float
		State q42 = new State(false);
		q42.addTransition('a', 43);
		states.put(42, q42);
		//float
		State q43 = new State(false);
		q43.addTransition('t', 120);
		states.put(43, q43);

		//G
		State q44 = new State(false);
		q44.addTransition('o', 45);
		states.put(44, q44);
		//goto
		State q45 = new State(false);
		q45.addTransition('t', 46);
		states.put(45, q45);
		//goto
		State q46 = new State(false);
		q46.addTransition('o', 120);
		states.put(46, q46);

		//I
		State q47 = new State(false);
		q47.addTransition('f', 120);
		q47.addTransition('n', 48);
		states.put(47, q47);
		//int
		State q48 = new State(false);
		q48.addTransition('t', 120);
		states.put(48, q48);

		//L
		State q49 = new State(false);
		q49.addTransition('o', 50);
		states.put(49, q49);
		//long
		State q50 = new State(false);
		q50.addTransition('n', 51);
		states.put(50, q50);
		//long
		State q51 = new State(false);
		q51.addTransition('g', 120);
		states.put(51, q51);

		//R
		State q52 = new State(false);
		q52.addTransition('e', 53);
		states.put(52, q52);
		//register
		State q53 = new State(false);
		q53.addTransition('g', 54);
		q53.addTransition('t', 59);
		states.put(53, q53);
		//register
		State q54 = new State(false);
		q54.addTransition('i', 55);
		states.put(54, q54);
		//register
		State q55 = new State(false);
		q55.addTransition('s', 56);
		states.put(55, q55);
		//register
		State q56 = new State(false);
		q56.addTransition('t', 57);
		states.put(56, q56);
		//register
		State q57 = new State(false);
		q57.addTransition('e', 58);
		states.put(57, q57);
		//register
		State q58 = new State(false);
		q58.addTransition('r', 120);
		states.put(58, q58);
		//return
		State q59 = new State(false);
		q59.addTransition('u', 60);
		states.put(59, q59);
		//return
		State q60 = new State(false);
		q60.addTransition('r', 61);
		states.put(60, q60);
		//return
		State q61 = new State(false);
		q61.addTransition('n', 120);
		states.put(61, q61);

		//S
		State q62 = new State(false);
		q62.addTransition('h', 63);
		q62.addTransition('i', 66);
		q62.addTransition('t', 73);
		q62.addTransition('w', 77);
		states.put(62, q62);
		//short
		State q63 = new State(false);
		q63.addTransition('o', 64);
		states.put(63, q63);
		//short
		State q64 = new State(false);
		q64.addTransition('r', 65);
		states.put(64, q64);
		//short
		State q65 = new State(false);
		q65.addTransition('t', 120);
		states.put(65, q65);
		//si...
		State q66 = new State(false);
		q66.addTransition('g', 67);
		q66.addTransition('z', 70);
		states.put(66, q66);
		//signed
		State q67 = new State(false);
		q67.addTransition('n', 68);
		states.put(67, q67);
		//signed
		State q68 = new State(false);
		q68.addTransition('e', 69);
		states.put(68, q68);
		//signed
		State q69 = new State(false);
		q69.addTransition('d', 120);
		states.put(69, q69);
		//sizeof
		State q70 = new State(false);
		q70.addTransition('e', 71);
		states.put(70, q70);
		//sizeof
		State q71 = new State(false);
		q71.addTransition('o', 72);
		states.put(71, q71);
		//sizeof
		State q72 = new State(false);
		q72.addTransition('f', 120);
		states.put(72, q72);
		//static
		State q73 = new State(false);
		q73.addTransition('a', 74);
		q73.addTransition('r', 108);
		states.put(73, q73);
		//static
		State q74 = new State(false);
		q74.addTransition('t', 75);
		states.put(74, q74);
		//static
		State q75 = new State(false);
		q75.addTransition('i', 76);
		states.put(75, q75);
		//static
		State q76 = new State(false);
		q76.addTransition('c', 120);
		states.put(76, q76);
		//switch
		State q77 = new State(false);
		q77.addTransition('i', 78);
		states.put(77, q77);
		//switch
		State q78 = new State(false);
		q78.addTransition('t', 79);
		states.put(78, q78);
		//switch
		State q79 = new State(false);
		q79.addTransition('c', 80);
		states.put(79, q79);
		//switch
		State q80 = new State(false);
		q80.addTransition('h', 120);
		states.put(80, q80);
		//string
		State q108 = new State(false);
		q108.addTransition('i', 109);
		states.put(108, q108);
		//string
		State q109 = new State(false);
		q109.addTransition('n', 109);
		states.put(109, q109);
		//string
		State q110 = new State(false);
		q110.addTransition('g', 120);
		states.put(110, q110);
		

		//T
		State q81 = new State(false);
		q81.addTransition('y', 82);
		states.put(81, q81);
		//typedef
		State q82 = new State(false);
		q82.addTransition('p', 83);
		states.put(82, q82);
		//typedef
		State q83 = new State(false);
		q83.addTransition('e', 84);
		states.put(83, q83);
		//typedef
		State q84 = new State(false);
		q84.addTransition('d', 85);
		states.put(84, q84);
		//typedef
		State q85 = new State(false);
		q85.addTransition('e', 86);
		states.put(85, q85);
		//typedef
		State q86 = new State(false);
		q86.addTransition('f', 120);
		states.put(86, q86);

		//U
		State q87 = new State(false);
		q87.addTransition('n', 88);
		states.put(87, q87);
		//un...
		State q88 = new State(false);
		q88.addTransition('i', 89);
		q88.addTransition('s', 91);
		states.put(88, q88);
		//union
		State q89 = new State(false);
		q89.addTransition('o', 90);
		states.put(89, q89);
		//union
		State q90 = new State(false);
		q90.addTransition('n', 120);
		states.put(90, q90);
		//unsigned
		State q91 = new State(false);
		q91.addTransition('i', 92);
		states.put(91, q91);
		//unsigned
		State q92 = new State(false);
		q92.addTransition('g', 93);
		states.put(92, q92);
		//unsigned
		State q93 = new State(false);
		q93.addTransition('n', 94);
		states.put(93, q93);
		//unsigned
		State q94 = new State(false);
		q94.addTransition('e', 95);
		states.put(94, q94);
		//unsigned
		State q95 = new State(false);
		q95.addTransition('d', 120);
		states.put(95, q95);

		//V
		State q96 = new State(false);
		q96.addTransition('o', 97);
		states.put(96, q96);
		//vo...
		State q97 = new State(false);
		q97.addTransition('i', 98);
		q97.addTransition('l', 99);
		states.put(97, q97);
		//void
		State q98 = new State(false);
		q98.addTransition('d', 120);
		states.put(98, q98);
		//volatile
		State q99 = new State(false);
		q99.addTransition('a', 100);
		states.put(99, q99);
		//volatile
		State q100 = new State(false);
		q100.addTransition('t', 101);
		states.put(100, q100);
		//volatile
		State q101 = new State(false);
		q101.addTransition('i', 102);
		states.put(101, q101);
		//volatile
		State q102 = new State(false);
		q102.addTransition('l', 103);
		states.put(102, q102);
		//volatile
		State q103 = new State(false);
		q103.addTransition('e', 120);
		states.put(103, q103);

		//W
		State q104 = new State(false);
		q104.addTransition('h', 105);
		states.put(104, q104);
		//while
		State q105 = new State(false);
		q105.addTransition('i', 106);
		states.put(105, q105);
		//while
		State q106 = new State(false);
		q106.addTransition('l', 107);
		states.put(106, q106);
		//while
		State q107 = new State(false);
		q107.addTransition('e', 120);
		states.put(107, q107);

		//valida a expressao
		State q120 = new State(true);
		q120.addTransition('$', 120);
		states.put(120, q120);
	}

	// Reconhecer a sentenca de entrada
	public boolean analyse(String lexeme, String next) {
		boolean found = true;
		String input = lexeme;
		Integer state = 0;
		int length = input.length();

		for (int symbol = 0; symbol < length; symbol++) {
			state = states.get(state).getTransition(input.charAt(symbol));

			if (state == null) {
				found = false;
			}
		}

		this.tokenName = "reserved_word";
		this.tokenValue = input;

		return found;
	}
}
