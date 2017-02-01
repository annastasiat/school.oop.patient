/**
 * Created by work on 01.02.2017.
 */
public class Queries extends DBConnect {

    public void getPatientsByDiagnosis(){
        try {
            String query = "SELECT first_name, surname FROM patients WHERE id IN (SELECT card_id  FROM diagnosises  WHERE diagnosis=\"insomnia\")";
            rs = st.executeQuery(query);
            System.out.println("Patients who have diagnosis \"insomnia\":");
            while(rs.next()){
                String first_name = rs.getString("first_name");
                String surname = rs.getString("surname");
                System.out.println("First name: "+first_name+"    " +"Surame: "+surname);
            }
        }
        catch(Exception ex){
            System.out.println("Error:"+ex);
        }
    }
    public void getPatientsByIdInterval(){
        try {
            String query = "SELECT first_name, surname FROM patients WHERE id BETWEEN 2000 AND 6000";
            rs = st.executeQuery(query);
            System.out.println("Patients who have id between 2000 and 6000:");
            while(rs.next()){
                String first_name = rs.getString("first_name");
                String surname = rs.getString("surname");
                System.out.println("First name: "+first_name+"    " +"Surame: "+surname);
            }
        }
        catch(Exception ex){
            System.out.println("Error:"+ex);
        }
    }

}
