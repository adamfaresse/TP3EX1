public class DecorateurNumeroPage {
    Livre l ;


    public DecorateurNumeroPage(Livre l){
        this.l = l;
    }
    void afficheLigne(int page, int ligne) {l.afficheLigne(page,ligne);}
    void affichePage(int page) {
        l.affichePage(page);
        System.out.println("Numéro de page ="+page);
    }
    Page getPages(int i) {return l.getPages(i); }
    String getTitre() {return l.getTitre(); }


}
}
