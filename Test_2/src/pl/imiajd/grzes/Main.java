package pl.imiajd.grzes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Klient {
    public class porownaj implements Cloneable, Comparable<porownaj> {
        private Integer klient;
        private LocalDate data_zakupu;
        private String nazwa;
        private Double rachunek;

        public Klient(String nazwa, LocalDate dataZakupy, double rachunek){
            this.nazwa = nazwa;
            this.dataZakupy = dataZakupy;
            this.rachunek = rachunek;
        }


        public porownaj(int klient, LocalDate data_zakupu, String nazwa, Double rachunek) {
            this.klient = klient;
            this.data_zakupu = data_zakupu;
            this.nazwa = nazwa;
            this.rachunek = rachunek;
        }

        public int compareTo(porownaj) {
            int klient_1 = klient.compareTo(this.klient);
            int klient_2 = klient.compareTo(this.klient);
            int data_1 = data_zakupu.compareTo(this.data_zakupu);
            int data_2 = data_zakupu.compareTo(this.data_zakupu);
            int nazwa_1 = nazwa.compareTo(this.nazwa);
            int nazwa_2 = nazwa.compareTo(this.nazwa);
            int rachunek_1 = rachunek.compareTo(this.rachunek);
            int rachunek_2 = rachunek.compareTo(this.rachunek);
        }

        public class ObslugaKlienta {
            static Double procentRabatu.compareTo(this.procentRabatu);
            private ArrayList<Klient> lista;

            int set;
            set = procentRabatu;
            procentRabatu = 0.05;
            return procentRabatu
        }

        public static discountAmount(Klient) {
            if(k.getRachunek() > 300){
                return k.getRachunek()*this.procentRabatu;
            }
            else{
                return 0;
            }
        }
    }
}