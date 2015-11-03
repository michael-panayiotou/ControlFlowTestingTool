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
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ControlFlowTestingUI  extends javax.swing.JFrame {

	private JFrame frame;

	/**
	 * ekamato
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
	        
	        for (int i = 0; i < hilites.length; i++) {
	            if (hilites[i].getPainter() instanceof HighLightSourceCode) {
	                hilite.removeHighlight(hilites[i]);
	            }
	        }
	        }
	    
	    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 844, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel paneBurger = new JPanel();
		frame.getContentPane().add(paneBurger, "name_22451503339373");
		
		JButton btnWhile = new JButton("while");
		btnWhile.setBounds(16, 58, 117, 29);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(169, 63, 501, 355);
		paneBurger.add(textArea);
		
		paneBurger.setLayout(null);
		paneBurger.add(btnWhile);
		
		JButton btnFor = new JButton("for");

		btnFor.setBounds(16, 85, 117, 29);
		paneBurger.add(btnFor);
		
		JButton btnIf = new JButton("if");
		btnIf.setBounds(16, 112, 117, 29);
		paneBurger.add(btnIf);
		
		JButton btnSwitch = new JButton("switch");
		btnSwitch.setBounds(16, 140, 117, 29);
		paneBurger.add(btnSwitch);
		

		
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
		
		
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_22460779132613");
		
		JPanel panelChicken = new JPanel();
		frame.getContentPane().add(panelChicken, "name_22464482082225");
		
		
		
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
