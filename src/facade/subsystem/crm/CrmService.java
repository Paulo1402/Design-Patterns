package facade.subsystem.crm;

public class CrmService {
  public static void saveClient(String name, String cep, String city, String state) {
    System.out.println("Cliente salvo no sistema de CRM:");
    System.out.println(name);    
    System.out.println(cep);    
    System.out.println(city);    
    System.out.println(state);    
  }
}
