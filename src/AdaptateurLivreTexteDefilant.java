public class AdaptateurLivreTexteDefilant implements TexteDefilant{
    private Livre l = new Livre();
    public int page = 0;
    public int ligne= 0;
    @Override
    public void ligneSuivante() {
        if(l.getPages(page).nombreLignes() == ligne){
            page++;
            ligne = 0;
        }
        ligne++;
        l.afficheLigne(page,ligne);

    }

    @Override
    public void ecranSuivant() {
        page++;
        l.affichePage(page);

    }
}
