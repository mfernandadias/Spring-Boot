import org.springframeqork.context.annotation.Configuration;
import org.springframeqork.context.annotation.Configuration;
import org.spring.framework.context.datasource.DriverManagerDataSource;

@Configuration
public class DataConfiguration{

    @Bean
    public DataSource dataDource(){
        DirverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource dataSource = new sriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbl.Driver");
        dataDource.setURL("jdbc:mysql://localhost:3306/eventoapp");
        dataSource.setPassword("michellil4");
        return dataSource;
    }

    @Bean
    pulic JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVenderadapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter,setShowlSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlaform("org.hibernate.dialet.MySQLDialect");
        adapter.setPrepareConnection(true);
        return adapter;
    }
}