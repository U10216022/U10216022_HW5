import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class calc2 extends JFrame{
	
	private static String password ="0000";
	
	static JTextField jtfResult;
	static String display = "";
	static double TEMP;
	static double finalTEMP;
	static Boolean addBoolean = false ;
	static Boolean subBoolean = false ;
	static Boolean divBoolean = false ;
	static Boolean mulBoolean = false ;
	static Boolean sinBoolean = false ;
	static Boolean cosBoolean = false ;
	static Boolean squareBoolean = false ;
	static Boolean rootBoolean = false ;
	static Boolean dontpassbutton = false;
	static Boolean passbutton=true;
	
	 public static void main(String[] args) {
	      
	      final CardLayout cardlayout = new CardLayout();
	      final JFrame frame = new JFrame();
	     
	      frame.setSize(400,400);
	      frame.setLocationRelativeTo(null);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	      final Container contentPane = frame.getContentPane();
	      contentPane.setLayout(cardlayout);
	    
	      final JPanel panel1 = new JPanel();
	      final JPanel p1 = new JPanel ();
	      final JPanel p2 = new JPanel ();   //Create panel p2 to hold a text field and p1
	 
	      JButton jbtNum1 = new JButton("1");
	      JButton jbtNum2 = new JButton("2");
	      JButton jbtNum3 = new JButton("3");
	      JButton jbtNum4 = new JButton("4");
	      JButton jbtNum5 = new JButton("5");
	      JButton jbtNum6 = new JButton("6");
	      JButton jbtNum7 = new JButton("7");
	      JButton jbtNum8 = new JButton("8");
	      JButton jbtNum9 = new JButton("9");
	      JButton jbtNum0 = new JButton("0");
	      JButton jbtAdd = new JButton("+");
	      JButton jbtSubtract = new JButton("-");
	      JButton jbtMultiply = new JButton("*");
	      JButton jbtDivide = new JButton("/");
	      JButton jbtEqual = new JButton("=");
	      JButton jbtClear = new JButton("C");
	      JButton jbtSin = new JButton("sin");
	      JButton jbtCos = new JButton("cos");
	      JButton jbtSquare = new JButton("X^y"); 
	      JButton jbtRoot = new JButton("Root");
	      JLabel label = new JLabel("Enter the password:");
			
	      p1.add(jbtNum1);
	      p1.add(jbtNum2);
	      p1.add(jbtNum3);
	      p1.add(jbtNum4);
	      p1.add(jbtNum5);
	      p1.add(jbtNum6);	     
	      p1.add(jbtNum7);
	      p1.add(jbtNum8);
	      p1.add(jbtNum9);
	      p1.add(jbtNum0);
	      p1.add(jbtAdd);
	      p1.add(jbtSubtract);
	      p1.add(jbtMultiply);
	      p1.add(jbtDivide);
	      p1.add(jbtEqual);
	      p1.add(jbtClear);
	      p1.add(jbtSin);
	      p1.add(jbtCos);
	      p1.add(jbtSquare);
	      p1.add(jbtRoot);
	      
	      p1.setLayout(new GridLayout(5,5));
	      
	      jtfResult = new JTextField("");
	      p2.add(jtfResult);
	      p2.setLayout(new GridLayout(2,2));
	      p2.add(p1);
		
	      contentPane.add(panel1, "Panel 1");
	      contentPane.add(p2, "Panel 2");
	     
	     final JButton button2 = new JButton("Enter");
	      button2.setVisible(dontpassbutton);
	      panel1.add(button2);
	      
	      JPasswordField pass = new JPasswordField (10);
	      panel1.add(label);
	      panel1.add(pass);
	      pass.setEchoChar('*');

	      
	      pass.addActionListener(new ActionListener(){
	    	  
	    	  public void actionPerformed(ActionEvent e) {
			    	
	    		  JPasswordField input = (JPasswordField) e.getSource();
			    	char [] passwordd = input.getPassword();
			    	String p = new String(passwordd);
			    	
			    	if(p.equals(password)){
			    		button2.setVisible(passbutton);
			    	}
			    	else{
			    		JOptionPane.showMessageDialog(null, "Incorrect");
			    	}
			    }
			});
		
	         ActionListener btnListener = new ActionListener() {
	        	 public void actionPerformed(ActionEvent e) {
	        		 cardlayout.next(contentPane);
	        	 }
	         };
	         
	         button2.addActionListener(btnListener);
	
	      jbtNum1.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			        display = jtfResult.getText();
			        jtfResult.setText(display + "1");
			    }
	      } ) ;      //Button " 1 "
	
	      jbtNum2.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			        display = jtfResult.getText();
			        jtfResult.setText(display + "2");
			    }
			} ) ;    //Button " 2 "	
	
	      jbtNum3.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 display = jtfResult.getText();
					 jtfResult.setText(display + "3");
				 }
			} ) ;    //Button " 3 "	
	
	      jbtNum4.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 display = jtfResult.getText();
					 jtfResult.setText(display + "4");
				 }
			} ) ;    //Button " 4 "
	      
	      
	      jbtNum5.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 display = jtfResult.getText();
					 jtfResult.setText(display + "5");
				 }
	      } ) ;     //Button " 5 "
	
	      jbtNum6.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			        display = jtfResult.getText();
			        jtfResult.setText(display + "6");
			    }
	      } ) ;     //Button " 6 "
	      
	      
	      jbtNum7.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 display = jtfResult.getText();
					 jtfResult.setText(display + "7");
				 }
	      } ) ;     //Button " 7 "	
		
	      jbtNum8.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 display = jtfResult.getText();
					 jtfResult.setText(display + "8");
				 }
	      } ) ;     //Button " 8 "
		
	      jbtNum9.addActionListener ( new ActionListener(){
	    	  	public void actionPerformed(ActionEvent e) {
			        display = jtfResult.getText();
			        jtfResult.setText(display + "9");
			    }
	      } ) ;     //Button " 9 "
	      
	      
	      jbtNum0.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
			        display = jtfResult.getText();
			        jtfResult.setText(display + "0");
			    }
	      } ) ;     //Button " 0 "	
	      
	      
	      jbtAdd.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					 TEMP = Double.parseDouble(jtfResult.getText());
					 jtfResult.setText("");
					 addBoolean = true ;
				}
			} ) ;    //Button " + "	
	
	      jbtSubtract.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = Double.parseDouble(jtfResult.getText());
					jtfResult.setText("");
					subBoolean = true;
				}
	      } ) ;     //Button " - "	
	      
	      
	      jbtMultiply.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = Double.parseDouble(jtfResult.getText());
					jtfResult.setText("");
					mulBoolean = true;
				}
	      } ) ;     //Button " * "
	
	      
	      jbtDivide.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = Double.parseDouble(jtfResult.getText());
					jtfResult.setText("");
					divBoolean = true;
				}
	      } ) ;     //Button " / "
	      
	      
	      jbtEqual.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					finalTEMP = Double.parseDouble(  jtfResult.getText() );
						if ( addBoolean == true  ){
							 finalTEMP = TEMP + finalTEMP;
						}
						else if ( subBoolean == true  ){
			            	 finalTEMP = TEMP - finalTEMP;
						}
						else if ( mulBoolean == true  ){
			            	 finalTEMP = TEMP * finalTEMP;
						}
						else if ( divBoolean == true  ){
			            	 finalTEMP = TEMP / finalTEMP;
						}
						else if ( sinBoolean == true  ){
			            	 finalTEMP = Math.sin(finalTEMP);
						}
						else if ( cosBoolean == true  ){
			            	 finalTEMP = Math.cos(finalTEMP);
						}
						else if ( squareBoolean == true  ){
			            	 finalTEMP = Math.pow(TEMP, finalTEMP);
						}
						else if ( rootBoolean == true  ){
			            	 finalTEMP = Math.sqrt(finalTEMP);
						}
						 
						 jtfResult.setText(  Double.toString( finalTEMP ) );
			
						 addBoolean = false ;
						 subBoolean = false ;
						 mulBoolean = false ;
						 divBoolean = false ;
						 sinBoolean = false ;
						 cosBoolean = false ;
						 squareBoolean = false;
						 rootBoolean = false ;
			
				    }
				}
			 ) ;     //Button " = "	
	      
	      
	      jbtClear.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					jtfResult.setText("");
					addBoolean = false ;
					subBoolean = false ;
					mulBoolean = false ;
					divBoolean = false ;
					TEMP = 0;
					finalTEMP =0;
			    }
	      } ) ;     //Button " C "
	      
	      
	      
	      jbtSin.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = 0;
					jtfResult.setText("");
					sinBoolean = true;
				}
	      } ) ;    //Button " sin "
		 
	
	      jbtCos.addActionListener ( new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 TEMP = 0;
					 jtfResult.setText("");
					 cosBoolean = true;
				 }
	      } ) ;     //Button " cos "
	
	       
	      jbtSquare.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = Double.parseDouble(jtfResult.getText());
					jtfResult.setText("");
					squareBoolean = true;
				}
	      } ) ;     //Button " X^y "
	
	     	
	      jbtRoot.addActionListener ( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					TEMP = 0;
					jtfResult.setText("");
					rootBoolean = true;
				}
	      } ) ;     //Button " Root "
			
	   }
	
}
