import com.configmechanism.ConfigurationReader; import 
org.apache.commons.configuration.Configuration; public class 
HelloConfig{
  public static void main(String[] args) {
    try {
      ConfigurationReader configurationReader
          = new ConfigurationReader();
      Configuration config
          = configurationReader.getConfiguration();
      // Printing environment-specific greetings
      System.out.println(config.getString("env.greetings"));
      // Configuration parameters from hello.properties
      System.out.print(config.getString("sample.hello") + " ");
      System.out.println(config.getString("sample.world"));
      // Configuration parameters from author.xml
      System.out.print("author: ");
      System.out.print(config.getString("name.first") + " ");
      System.out.println(config.getString("name.last"));
      System.out.println(config.getString("url"));
      // Printing environment-specific goodbye
      System.out.println(config.getString("env.goodbye"));
    }
    catch (Exception exc) {
      exc.printStackTrace();
    }
  }
}
