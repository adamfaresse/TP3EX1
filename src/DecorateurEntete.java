public class DecorateurEntete extends Livre {
    Livre l ;


    public DecorateurEntete(Livre l){
        this.l = l;
    }
    void afficheLigne(int page, int ligne) {l.afficheLigne(page,ligne);}
    void affichePage(int page) {
        System.out.println(getTitre());
        l.affichePage(page);
    }
    Page getPages(int i) {return l.getPages(i); }
    String getTitre() {return l.getTitre(); }


}
