import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tester extends JFrame implements ActionListener{
    private JButton DFour, DSix, DEight, DTen, DTwelve, DTwenty, DHundred, generateCharacter, generateStr, generateDex, generateCon, generateInt, generateWis, generateCha, generateLoot, exit, rEncounter;

    public Tester(){
        GridBagConstraints LayoutConst = null;

        //initialize JButtons 
        DFour = new JButton("Roll D4");
        DSix = new JButton("Roll D6");
        DEight = new JButton("Roll D8");
        DTen = new JButton("Roll D10");
        DTwelve = new JButton("Roll D12");
        DTwenty = new JButton("Roll D20");
        DHundred = new JButton("Roll D100");
        generateCharacter = new JButton("Generate Character");
        generateStr = new JButton("Generate Strength");
        generateDex = new JButton("Generate Dexterity");
        generateCon = new JButton("Generate Constitution");
        generateInt = new JButton("Generate Intelligence");
        generateWis = new JButton("Generate Wisdom");
        generateCha = new JButton("Generate Charisma");
        generateLoot = new JButton("Generate Loot");
        rEncounter = new JButton("Random Encounter!");
        exit = new JButton("Exit");
        Color freyasColor = new Color(34, 102, 216);
        Color bonniesColor = new Color(225, 0, 150);
        Color theosColor = new Color(200, 180, 225);
        Color idk = new Color(112, 112, 112);

        DEight.setBackground(idk);
        DTwelve.setBackground(theosColor);
        DFour.setBackground(bonniesColor);
        DTwenty.setBackground(freyasColor);

        //add action listeners
        DFour.addActionListener(this);
        DSix.addActionListener(this);
        DEight.addActionListener(this);
        DTen.addActionListener(this);
        DTwelve.addActionListener(this);
        DTwenty.addActionListener(this);
        DHundred.addActionListener(this);
        generateCharacter.addActionListener(this);
        generateStr.addActionListener(this);
        generateDex.addActionListener(this);
        generateCon.addActionListener(this);
        generateInt.addActionListener(this);
        generateWis.addActionListener(this);
        generateCha.addActionListener(this);
        generateLoot.addActionListener(this);
        rEncounter.addActionListener(this);
        exit.addActionListener(this);

        //Set up layout
        setLayout(new GridBagLayout());

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DFour, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 1;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DSix, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 2;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DEight, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 3;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DTen, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DTwelve, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 1;
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DTwenty, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 2;
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(DHundred, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 3;
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateCharacter, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateStr, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 1;
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateDex, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 2;
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateCon, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 3;
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateInt, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 3;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateWis, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 1;
        LayoutConst.gridy = 3;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateCha, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 2;
        LayoutConst.gridy = 3;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(generateLoot, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 3;
        LayoutConst.gridy = 3;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(rEncounter, LayoutConst);

        LayoutConst = new GridBagConstraints();
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 4;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(exit, LayoutConst);

        setTitle("DnD Generator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Roll D4")){
            int rollFour = RollDice.Dfour();
            String message = Integer.toString(rollFour);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D6")){
            int rollSix = RollDice.Dsix();
            String message = Integer.toString(rollSix);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D8")){
            int rollEight = RollDice.Deight();
            String message = Integer.toString(rollEight);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D10")){
            int rollTen = RollDice.Dten();
            String message = Integer.toString(rollTen);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D12")){
            int rollTwelve = RollDice.Dtwelve();
            String message = Integer.toString(rollTwelve);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D20")){
            int rollTwenty = RollDice.Dtwenty();
            String message = Integer.toString(rollTwenty);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Roll D100")){
            int rollHundred = RollDice.Dhundred();
            String message = Integer.toString(rollHundred);
            JOptionPane.showMessageDialog(null, message);
        }
        if(e.getActionCommand().equals("Generate Character")){
            String c = GenerateCharacter.GenerateClass();
            String r = GenerateCharacter.GenerateRace();
            JOptionPane.showMessageDialog(null, " Race: " + r + "      Class: " + c );
        }
        if(e.getActionCommand().equals("Generate Strength")){
            String str = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Str: " + str);
        }
        if(e.getActionCommand().equals("Generate Dexterity")){
            String dex = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Dex: " + dex);
        }
        if(e.getActionCommand().equals("Generate Constitution")){
            String con = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Con: " + con);
        }
        if(e.getActionCommand().equals("Generate Intelligence")){
            String intel = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Int: " + intel);
        }
        if(e.getActionCommand().equals("Generate Wisdom")){
            String wis = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Wis: " + wis);
        }
        if(e.getActionCommand().equals("Generate Charisma")){
            String cha = RollDice.rollStat();

            JOptionPane.showMessageDialog(null, "Cha: " + cha);
        }
        if(e.getActionCommand().equals("Generate Loot")){
            String loot = GenerateCharacter.generateLoot();
            JOptionPane.showMessageDialog(null, loot);
        }
        if(e.getActionCommand().equals("Random Encounter!")){
            String encounter = GenerateCharacter.generateEncounter();
            JOptionPane.showMessageDialog(null, encounter);
        }
        if(e.getActionCommand().equals("Exit")){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Tester t = new Tester();
    }
}
