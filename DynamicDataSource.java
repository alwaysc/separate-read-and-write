import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;  

/**
 * 
 * @author aelns
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	private DataSourceSwitcher switcher;
	
    @Override  
    protected Object determineCurrentLookupKey() {  
        return switcher.getDataSource();  
    }

	public DataSourceSwitcher getSwitcher() {
		return switcher;
	}

	public void setSwitcher(DataSourceSwitcher switcher) {
		this.switcher = switcher;
	}
} 
