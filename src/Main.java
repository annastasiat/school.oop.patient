/**
 * Created by work on 01.02.2017.
 */
public class Main {
    public static void main(String[] args){

        DBConnect connect = new DBConnect();
        Queries query = new Queries();
        query.getPatientsByIdInterval();
        query.getPatientsByDiagnosis();
    }
}
