package it.epicode.EsDay92.adapter;

//si aspetta di poter utilizzare DataSource
public class UserData {
    private String nomecompleto;
    private int eta;
    private void getData(DataSource ds){
        nomecompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
