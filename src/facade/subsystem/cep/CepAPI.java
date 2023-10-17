package facade.subsystem.cep;

public class CepAPI {
  private static CepAPI instance = new CepAPI();

  private CepAPI() {
    super();
  }

  public static CepAPI getInstance() {
    return instance;
  }

  public String getCity(String cep) {
    return "Curitiba";
  }

  public String getState(String cep) {
    return "PR";
  }
}
