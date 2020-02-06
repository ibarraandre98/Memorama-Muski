package ami;

import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ami extends JFrame implements ActionListener {

    JButton[] amigoos = new JButton[20];
    String i1 = "", i2 = "", i3 = "", i4 = "", i5 = "", i6 = "", i7 = "", i8 = "", i9 = "", i10 = "", i11 = "", i12 = "", i13 = "", i14 = "", i15 = "",
            i16 = "", i17 = "", i18 = "", i19 = "", i20 = "";
    JPanel pan4;
    boolean im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12, im13, im14, im15, im16, im17, im18, im19, im20;
    boolean ima1 = false, ima2 = false, ima3 = false, ima4 = false, ima5 = false, ima6 = false, ima7 = false, ima8 = false, ima9 = false, ima10 = false;
    boolean m1 = false, m2 = false, m3 = false, m4 = false, m5 = false, m6 = false, m7 = false, m8 = false, m9 = false, m10 = false, m11 = false, m12 = false, m13 = false, m14 = false, m15 = false, m16 = false, m17 = false, m18 = false, m19 = false, m20 = false;
    int puntaje=0;
    int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0,cont10=0,cont11=0,cont12=0,cont13=0,cont14=0,cont15=0,cont16=0,cont17=0,cont18=0,cont19=0,cont20=0;
    int contgen;
    public Ami() {
        setTitle("Memorama MUSKI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        amigos();
        add(pan4);
        setVisible(true);
    }

    public void amigos() {
        pan4 = new JPanel();
        pan4.setBorder(BorderFactory.createTitledBorder("Ross"));
        pan4.setLayout(new GridLayout(5, 2));
        for (int i = 0; i < 20; i++) {
            amigoos[i] = new JButton();
            amigoos[i].setBackground(Color.white);
            amigoos[i].setIcon(new ImageIcon("a0.jpg"));
            amigoos[i].addActionListener(this);
            pan4.add(amigoos[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == amigoos[0] && ima1 == false) {
            if (m1 == false) {
                amigoos[0].setIcon(new ImageIcon("a1.jpg"));
                m1 = true;                
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m19 = false;
                m20 = false;
                if(m1==true){
                    cont1++;
                }
                if(cont1>1){
                    contgen++;
                }
            } else {
                amigoos[0].setIcon(new ImageIcon("a0.jpg"));
                m1 = false; 
                contgen--;
            }
        }
        if (e.getSource() == amigoos[1] && ima2 == false) {
            if (m2 == false) {
                amigoos[1].setIcon(new ImageIcon("a2.jpg"));
                m1 = false;
                m2 = true;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                if(m2==true){
                    cont2++;
                }
                if(cont2>1){
                    contgen++;
                }
            } else {
                amigoos[1].setIcon(new ImageIcon("a0.jpg"));
                m2 = false;
                contgen--;
            }
        }
        if (e.getSource() == amigoos[2] && ima3 == false) {
            if (m3 == false) {
                amigoos[2].setIcon(new ImageIcon("a3.jpg"));
                m1 = false;
                m2 = false;
                m3 = true;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m3==true){
                    cont3++;
                }
                if(cont3>1){
                    contgen++;
                }
            } else {
                amigoos[2].setIcon(new ImageIcon("a0.jpg"));
                m3 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[3] && ima4 == false) {
            if (m4 == false) {
                amigoos[3].setIcon(new ImageIcon("a4.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = true;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m4==true){
                    cont4++;
                }
                if(cont4>1){
                    contgen++;
                }
            } else {
                amigoos[3].setIcon(new ImageIcon("a0.jpg"));
                m4 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[4] && ima5 == false) {
            if (m5 == false) {
                amigoos[4].setIcon(new ImageIcon("a5.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = true;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m14 = false;
                m15 = false;
                m17 = false;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m5==true){
                    cont5++;
                }
                if(cont5>1){
                    contgen++;
                }
            } else {
                amigoos[4].setIcon(new ImageIcon("a0.jpg"));
                m5 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[5] && ima6 == false) {
            if (m6 == false) {
                amigoos[5].setIcon(new ImageIcon("a6.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = true;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m17 = false;
                m16 = false;
                m18 = false;
                m20 = false;
                if(m6==true){
                    cont6++;
                }
                if(cont6>1){
                    contgen++;
                }
            } else {
                amigoos[5].setIcon(new ImageIcon("a0.jpg"));
                m6 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[6] && ima7 == false) {
            if (m7 == false) {
                amigoos[6].setIcon(new ImageIcon("a7.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = true;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m15 = false;
                m17 = false;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m7==true){
                    cont7++;
                }
                if(cont7>1){
                    contgen++;
                }
            } else {
                amigoos[6].setIcon(new ImageIcon("a0.jpg"));
                m7 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[7] && ima8 == false) {
            if (m8 == false) {
                amigoos[7].setIcon(new ImageIcon("a8.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = true;
                m9 = false;
                m10 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m8==true){
                    cont8++;
                }
                if(cont8>1){
                    contgen++;
                }
            } else {
                amigoos[7].setIcon(new ImageIcon("a0.jpg"));
                m8 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[8] && ima9 == false) {
            if (m9 == false) {
                amigoos[8].setIcon(new ImageIcon("a9.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = true;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m9==true){
                    cont9++;
                }
                if(cont9>1){
                    contgen++;
                }
            } else {
                amigoos[8].setIcon(new ImageIcon("a0.jpg"));
                m9 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[9] && ima10 == false) {
            if (m10 == false) {
                amigoos[9].setIcon(new ImageIcon("a10.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = true;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m10==true){
                    cont10++;
                }
                if(cont10>1){
                    contgen++;
                }
            } else {
                amigoos[8].setIcon(new ImageIcon("a0.jpg"));
                m9 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[10] && ima8 == false) {
            if (m11 == false) {
                amigoos[10].setIcon(new ImageIcon("a8.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m9 = false;
                m10 = false;
                m11 = true;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m11==true){
                    cont11++;
                }
                if(cont11>1){
                    contgen++;
                }
            } else {
                amigoos[10].setIcon(new ImageIcon("a0.jpg"));
                m11 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[11] && ima3 == false) {
            if (m12 == false) {
                amigoos[11].setIcon(new ImageIcon("a3.jpg"));
                m1 = false;
                m2 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = true;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m12==true){
                    cont12++;
                }
                if(cont12>1){
                    contgen++;
                }
            } else {
                amigoos[11].setIcon(new ImageIcon("a0.jpg"));
                m12 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[12] && ima5 == false) {
            if (m13 == false) {
                amigoos[12].setIcon(new ImageIcon("a5.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = true;
                m14 = false;
                m15 = false;
                m17 = false;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m13==true){
                    cont13++;
                }
                if(cont13>1){
                    contgen++;
                }
            } else {
                amigoos[12].setIcon(new ImageIcon("a0.jpg"));
                m13 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[13] && ima7 == false) {
            if (m14 == false) {
                amigoos[13].setIcon(new ImageIcon("a7.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = true;
                m15 = false;
                m17 = false;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m14==true){
                    cont14++;
                }
                if(cont14>1){
                    contgen++;
                }
            } else {
                amigoos[13].setIcon(new ImageIcon("a0.jpg"));
                m14 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[14] && ima9 == false) {
            if (m15 == false) {
                amigoos[14].setIcon(new ImageIcon("a9.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = true;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m15==true){
                    cont15++;
                }
                if(cont15>1){
                    contgen++;
                }
            } else {
                amigoos[14].setIcon(new ImageIcon("a0.jpg"));
                m15 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[15] && ima4 == false) {
            if (m16 == false) {
                amigoos[15].setIcon(new ImageIcon("a4.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = true;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m16==true){
                    cont16++;
                }
                if(cont16>1){
                    contgen++;
                }
            } else {
                amigoos[15].setIcon(new ImageIcon("a0.jpg"));
                m16 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[16] && ima10 == false) {
            if (m17 == false) {
                amigoos[16].setIcon(new ImageIcon("a10.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m17 = true;
                m16 = false;
                m18 = false;
                m19 = false;
                m20 = false;
                if(m17==true){
                    cont17++;
                }
                if(cont17>1){
                    contgen++;
                }
            } else {
                amigoos[16].setIcon(new ImageIcon("a0.jpg"));
                m17 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[17] && ima1 == false) {
            if (m18 == false) {
                amigoos[17].setIcon(new ImageIcon("a1.jpg"));
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = true;
                m19 = false;
                m20 = false;
                if(m18==true){
                    cont18++;
                }
                if(cont18>1){
                    contgen++;
                }
            } else {
                amigoos[17].setIcon(new ImageIcon("a0.jpg"));
                m18 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[18] && ima6 == false) {
            if (m19 == false) {
                amigoos[18].setIcon(new ImageIcon("a6.jpg"));
                m1 = false;
                m2 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m17 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = true;
                m20 = false;
                if(m19==true){
                    cont19++;
                }
                if(cont19>1){
                    contgen++;
                }
            } else {
                amigoos[18].setIcon(new ImageIcon("a0.jpg"));
                m19 = false;
                contgen--;
            }
        }

        if (e.getSource() == amigoos[19] && ima2 == false) {
            if (m20 == false) {
                amigoos[19].setIcon(new ImageIcon("a2.jpg"));
                m1 = false;
                m3 = false;
                m4 = false;
                m5 = false;
                m6 = false;
                m7 = false;
                m8 = false;
                m9 = false;
                m10 = false;
                m11 = false;
                m12 = false;
                m13 = false;
                m14 = false;
                m15 = false;
                m16 = false;
                m17 = false;
                m18 = false;
                m19 = false;
                m20 = true;
                if(m20==true){
                    cont20++;
                }
                if(cont20>1){
                    contgen++;
                }
            } else {
                amigoos[19].setIcon(new ImageIcon("a0.jpg"));
                m20 = false;
                contgen--;
            }
        }

        if (m1 == true && m18 == true) {
            ima1 = true;
            puntaje=puntaje+5;
        }
        if (m2 == true && m20 == true) {
            ima2 = true;
            puntaje=puntaje+5;
        }
        if (m3 == true && m12 == true) {
            ima3 = true;
            puntaje=puntaje+5;
        }
        if (m4 == true && m16 == true) {
            ima4 = true;
            puntaje=puntaje+5;
        }
        if (m5 == true && m13 == true) {
            ima5 = true;
            puntaje=puntaje+5;
        }
        if (m6 == true && m19 == true) {
            ima6 = true;
            puntaje=puntaje+5;
        }
        if (m7 == true && m14 == true) {
            ima7 = true;
            puntaje=puntaje+5;
        }
        if (m8 == true && m11 == true) {
            ima8 = true;
            puntaje=puntaje+5;
        }
        if (m9 == true && m15 == true) {
            ima9 = true;
            puntaje=puntaje+5;
        }
        if (m10 == true && m17 == true) {
            ima10 = true;
            puntaje=puntaje+5;
        }
        if (m1 == false && ima1 == false) {
            amigoos[0].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m2 == false && ima2 == false) {
            amigoos[1].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m3 == false && ima3 == false) {
            amigoos[2].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m4 == false && ima4 == false) {
            amigoos[3].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m5 == false && ima5 == false) {
            amigoos[4].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m6 == false && ima6 == false) {
            amigoos[5].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m7 == false && ima7 == false) {
            amigoos[6].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m8 == false && ima8 == false) {
            amigoos[7].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m9 == false && ima9 == false) {
            amigoos[8].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m10 == false && ima10 == false) {
            amigoos[9].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m11 == false && ima8 == false) {
            amigoos[10].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m12 == false && ima3 == false) {
            amigoos[11].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m13 == false && ima5 == false) {
            amigoos[12].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m14 == false && ima7 == false) {
            amigoos[13].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m15 == false && ima9 == false) {
            amigoos[14].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m16 == false && ima4 == false) {
            amigoos[15].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m17 == false && ima10 == false) {
            amigoos[16].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m18 == false && ima1 == false) {
            amigoos[17].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m19 == false && ima6 == false) {
            amigoos[18].setIcon(new ImageIcon("a0.jpg"));
        }
        if (m20 == false && ima2 == false) {
            amigoos[19].setIcon(new ImageIcon("a0.jpg"));
        }
        
        if (ima1==true&&ima2==true&&ima3==true&&ima4==true&&ima5==true&&ima6==true&&ima7==true&&ima8==true&&ima9==true&&ima10==true) {
            if(puntaje<0){
                JOptionPane.showMessageDialog(rootPane, "Su puntaje es : 0","Score",JOptionPane.INFORMATION_MESSAGE);
            }
            JOptionPane.showMessageDialog(rootPane, "Su puntaje es : "+(puntaje-contgen),"Score",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Ami();
    }

}
