
package pokemongui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class BuildGui extends JFrame {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    JLabel Image,PokemonIcon;
    Icon ClefableIcon,FlareonIcon,PikachuIcon,RhydonIcon;
    JButton select,eat;
    JComboBox selectPokemon;
    JTextArea ShowStatus;
    int indexclefable,indexflareon,indexpikachu,indexrhydon;
    
          public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "======== Pokemon List ======== \n"+"Pokemon "+
                pokemons.get(member).getName()+" health: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth;
        String weight = "\n======== Pokemon Weight ======== \n"+" Weight: "+
                pokemons.get(member).getWeight();
        return hp+weight;
    }
          
    public BuildGui (){
        super("Pokemon Games");
        
        Container C = getContentPane();
        C.setLayout(new BorderLayout());
        
        
        JPanel P = new JPanel();
        P.setBackground(Color.GRAY);
        P.setLayout(new FlowLayout());
        
        ShowStatus = new JTextArea();
               
       String allpokemons[] ={"Clefable","Flareon","Pikachu","Rhydon"};
        selectPokemon = new JComboBox(allpokemons);
        selectPokemon.setPreferredSize(new Dimension(150,20));
        
        ClefableIcon  = new ImageIcon(getClass().getResource("Clefable.png"));
        FlareonIcon = new ImageIcon(getClass().getResource("Flareon.png"));
        PikachuIcon = new ImageIcon(getClass().getResource("Pikachu.png"));
        RhydonIcon = new ImageIcon(getClass().getResource("Rhydon.png"));
        PokemonIcon   = new JLabel("");
        PokemonIcon.setIcon(ClefableIcon);
        
       selectPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    switch (selectPokemon.getSelectedIndex()) {
                        
                    
                         case 0:
                         PokemonIcon.setIcon(ClefableIcon);
                         indexclefable  = 0;
                         
                         break;
                         case 1:
                         PokemonIcon.setIcon(FlareonIcon);
                         indexflareon = 1;
                         break;
                          
                         case 2:
                         PokemonIcon.setIcon(PikachuIcon);
                         indexflareon = 2;
                         break;
                         
                         case 3: 
                         PokemonIcon.setIcon(RhydonIcon);
                         indexrhydon = 3;
                         break;
                         
                          default:
                          break;
                    } 
            }
                
        });
        
        P.add(PokemonIcon);
        P.add(selectPokemon);
        C.add(P, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,390);
        setVisible(true);
    }
    
    
    
}


