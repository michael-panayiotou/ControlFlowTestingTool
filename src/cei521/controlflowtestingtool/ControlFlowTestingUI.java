package cei521.controlflowtestingtool;

import java.awt.EventQueue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//this is just a comment
        

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class ControlFlowTestingUI  extends javax.swing.JFrame {

	private JFrame frame;

	/**
	 * 	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlFlowTestingUI window = new ControlFlowTestingUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlFlowTestingUI() {
		initialize();
	}
	   
	
	class HighLightSourceCode extends DefaultHighlighter.DefaultHighlightPainter
	    {

	        public HighLightSourceCode(Color color) {
	            super(color);
	        }
	        
	              
	    }
	    Highlighter.HighlightPainter myHighlightPainter = new HighLightSourceCode(Color.yellow);  
	    
	    public void removeHighlight(JTextComponent textComp) {
	        Highlighter hilite = textComp.getHighlighter();
	        Highlighter.Highlight[] hilites = hilite.getHighlights();
	        
	        for(int i = 0; i < hilites.length; i++) {
	            if(hilites[i].getPainter() instanceof HighLightSourceCode) {
	                hilite.removeHighlight(hilites[i]);
	            }
	        }
	        }
	    
	    
	/**
	 * Initialize the contents of the frame.
	 */
	    JLabel lblCount;
	    private void initialize() {
			frame = new JFrame();
			frame.setBackground(SystemColor.activeCaption);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marios\\git\\ControlFlowTestingTool\\Resources\\chart-32.png"));
			frame.setTitle("\u0395\u03C1\u03B3\u03B1\u03BB\u03B5\u03AF\u03BF \u0395\u03BB\u03AD\u03B3\u03C7\u03BF\u03C5 \u039A\u03CE\u03B4\u03B9\u03BA\u03B1");
			frame.setBounds(100, 100, 844, 465);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(new CardLayout(0, 0));
			Algorithm Alg=new Algorithm();
			/*Alg.algorithm("int main(){\n"
					+ "if(x>y){\n"
					+ "int F=0; "
					+ "if(y>f){\n"
					+ "print(\"y is bigger than f\");\n"
					+ "}\n"
					+ "print(\"ss\");\n"
					+ "}"
					+ "print(\"program is done\")\n"
					+ "}");*/
			JPanel paneBurger = new JPanel();
			frame.getContentPane().add(paneBurger, "name_22451503339373");
			
			JButton btnWhile = new JButton("While");
			btnWhile.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnWhile.setBounds(35, 61, 75, 29);
			
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setToolTipText("\u0395\u03C0\u03B9\u03BA\u03BF\u03BB\u03BB\u03AE\u03C3\u03C4\u03B5 \u03C4\u03BF\u03BD \u03BA\u03CE\u03B4\u03B9\u03BA\u03B1 \u03B5\u03B4\u03CE...");
			scrollPane.setBounds(257, 61, 501, 355);
			paneBurger.add(scrollPane);

			JTextArea textArea = new JTextArea();
			textArea.setToolTipText("\u0395\u03C0\u03B9\u03BA\u03BF\u03BB\u03BB\u03AE\u03C3\u03C4\u03B5 \u03C4\u03BF\u03BD \u03BA\u03CE\u03B4\u03B9\u03BA\u03B1 \u03B5\u03B4\u03CE...");
			textArea.setBounds(257, 61, 501, 355);
			paneBurger.add(textArea);
			scrollPane.setViewportView(textArea);
			
			
			paneBurger.setLayout(null);
			paneBurger.add(btnWhile);
			
			JButton btnFor = new JButton("For");
			btnFor.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");

			btnFor.setBounds(35, 88, 75, 29);
			paneBurger.add(btnFor);
			
			JButton btnIf = new JButton("If");
			btnIf.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnIf.setBounds(35, 115, 75, 29);
			paneBurger.add(btnIf);
			
			JButton btnSwitch = new JButton("Switch");
			btnSwitch.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnSwitch.setBounds(35, 143, 75, 29);
			paneBurger.add(btnSwitch);
			
			JLabel lblWhile = new JLabel(": 0");
			lblWhile.setBounds(120, 71, 46, 14);
			paneBurger.add(lblWhile);
			
			JLabel lblFor = new JLabel(": 0");
			lblFor.setBounds(120, 95, 46, 14);
			paneBurger.add(lblFor);
			
			JLabel lblIf = new JLabel(": 0");
			lblIf.setBounds(120, 122, 46, 14);
			paneBurger.add(lblIf);
			
			JLabel lblSwitch = new JLabel(": 0");
			lblSwitch.setBounds(120, 150, 46, 14);
			paneBurger.add(lblSwitch);
			
			JLabel lblIntegers = new JLabel(": 0");
			lblIntegers.setBounds(120, 178, 46, 14);
			paneBurger.add(lblIntegers);
			
			JLabel lblStrings = new JLabel(": 0");
			lblStrings.setBounds(120, 206, 46, 14);
			paneBurger.add(lblStrings);
			
			JLabel lblFloats = new JLabel(": 0");
			lblFloats.setBounds(120, 234, 46, 14);
			paneBurger.add(lblFloats);
			
			JButton btnIntegers = new JButton("Integers");
			btnIntegers.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnIntegers.setBounds(35, 171, 75, 29);
			paneBurger.add(btnIntegers);
			
			JButton btnStrings = new JButton("Strings");
			btnStrings.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnStrings.setBounds(35, 199, 75, 29);
			paneBurger.add(btnStrings);
			
			JButton btnFloats = new JButton("Floats");
			btnFloats.setToolTipText("\u03A0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03BC\u03CC");
			btnFloats.setBounds(35, 227, 75, 29);
			paneBurger.add(btnFloats);
			
			JLabel label = new JLabel("\u0391\u03C0\u03BF\u03C4\u03B5\u03BB\u03AD\u03C3\u03BC\u03B1\u03C4\u03B1 \u03A3\u03C4\u03B1\u03C4\u03B9\u03BA\u03AE\u03C2 \u0391\u03BD\u03AC\u03BB\u03C5\u03C3\u03B7\u03C2");
			label.setBounds(10, 32, 198, 29);
			paneBurger.add(label);
			

			
			btnWhile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					highlight(textArea, "while");
				}
			});
			
			btnFor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					highlight(textArea, "for");
				}
			});
			
			btnIf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					highlight(textArea, "if");
				}
			});
			
			btnSwitch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					highlight(textArea, "switch");
				}
			});
			
			textArea.getDocument().addDocumentListener(new DocumentListener() {
				
				String CodeToParse = "";
				@Override
				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);
					CodeToParse = textArea.getText();
					Alg.algorithm(CodeToParse);
				}

				@Override
				public void insertUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);
					CodeToParse = textArea.getText();	
					Alg.algorithm(CodeToParse);
				}

				@Override
				public void removeUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);
					CodeToParse = textArea.getText();
					Alg.algorithm(CodeToParse);
				}

		    });
			
			
		}
	
	public void count(JTextComponent textComp, JLabel lblIf, JLabel lblSwitch, JLabel lblFor, JLabel lblWhile, JLabel lblIntegers, JLabel lblFloats, JLabel lblStrings){
		removeComments(textComp);
	      String s = textComp.getText();
	      String[] splitted = s.split("\\s|\\n|[(]|\\[");
	      HashMap hm = new HashMap();
	      int x;

	      for (int i = 0; i < splitted.length; i++) {
	          if (!hm.containsKey(splitted[i])) {
	              hm.put(splitted[i], 1);
	          } else {
	              hm.put(splitted[i], (Integer) hm.get(splitted[i]) + 1);
	          }
	      }
	      for (Object word : hm.keySet()){
	    	  
	    	//System.out.println(word + " " + (Integer) hm.get(word));
	          //JOptionPane.showMessageDialog(null,word + " " + hm.get(word));

	           
	            if(word.equals("for")){
	                lblFor.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("while")){
	                lblWhile.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("switch")){
	                lblSwitch.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("if")){
	                lblIf.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("String")){
	                lblStrings.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("int")){
	                lblIntegers.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("float")){
	                lblFloats.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	      }
	    	      
	      
	}
	
	 public void removeComments(JTextComponent textComp) {
	        try {
	            Document doc;
	            doc = textComp.getDocument();
	            String text = doc.getText(0, doc.getLength());
	            String temptext = (text.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
	            textComp.setText(temptext);
	        } catch (Exception e) {
	        }
	        
	        
	    }
	    
	    
	    public void highlight(JTextComponent textComp, String pattern) {
	            
	            removeComments(textComp);
	            try {
	                removeHighlight(textComp);
	                Highlighter hilite = textComp.getHighlighter();
	                Document doc;
	                doc = textComp.getDocument();
	                String text = doc.getText(0, doc.getLength());
	                int pos = 0;
	                
	                while ((pos = text.toUpperCase().indexOf(pattern.toUpperCase(), pos)) >= 0) {
	                    if(pos == 0){
	                        if ((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n')){
	                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
	                        }
	                    }
	                    else{
	                        if (!(Character.isLetter(text.charAt(pos-1)))&&((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n'))){
	                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
	                        }
	                    }
	                    pos += pattern.length();
	                    
	                }
	            } catch (Exception e) {
	                
	            }
	            
	        }
}
