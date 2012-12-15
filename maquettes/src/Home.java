import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


public class Home {
	private static Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlCmss = new Shell();
		shlCmss.setSize(562, 236);
		shlCmss.setText("CMSS");
		
		
		Group group = new Group(shlCmss, SWT.NONE);
		group.setText("Current crisis");
		group.setBounds(10, 10, 544, 194);
		
		Button button = new Button(group, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				NewCrisis.main(null);
			}
		});
		button.setText("New crisis");
		button.setBounds(199, 134, 93, 33);
		
		table = new Table(group, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setBounds(10, 10, 520, 107);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(84);
		tableColumn.setText("Crisis number");
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(71);
		tableColumn_1.setText("Type");
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("Label");
		
		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setWidth(100);
		tableColumn_3.setText("Place");
		
		TableColumn tableColumn_4 = new TableColumn(table, SWT.NONE);
		tableColumn_4.setWidth(100);
		tableColumn_4.setText("State");
		
		TableColumn tableColumn_5 = new TableColumn(table, SWT.NONE);
		tableColumn_5.setWidth(100);
		tableColumn_5.setText("Details");
		
		Menu menu = new Menu(shlCmss, SWT.BAR);
		shlCmss.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmInformations = new MenuItem(menu_1, SWT.NONE);
		mntmInformations.setText("Informations");
		
		MenuItem mntmQuit = new MenuItem(menu_1, SWT.NONE);
		mntmQuit.setText("Quit");
		
		MenuItem menuItem = new MenuItem(menu, SWT.NONE);
		
		MenuItem mntmDatabases = new MenuItem(menu, SWT.CASCADE);
		mntmDatabases.setText("Databases");
		
		Menu menu_2 = new Menu(mntmDatabases);
		mntmDatabases.setMenu(menu_2);
		
		MenuItem mntmPsc = new MenuItem(menu_2, SWT.NONE);
		mntmPsc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PSCDB.main(null);
			}
		});
		mntmPsc.setText("PSC");
		
		MenuItem mntmFsc = new MenuItem(menu_2, SWT.NONE);
		mntmFsc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FSCDB.main(null);
			}
		});
		mntmFsc.setText("FSC");
		
		MenuItem mntmCrisis = new MenuItem(menu, SWT.CASCADE);
		mntmCrisis.setText("Crisis");
		
		Menu menu_3 = new Menu(mntmCrisis);
		mntmCrisis.setMenu(menu_3);
		
		MenuItem mntmNew = new MenuItem(menu_3, SWT.NONE);
		mntmNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				NewCrisis.main(null);
			}
		});
		mntmNew.setText("New");
		
		MenuItem mntmList = new MenuItem(menu_3, SWT.NONE);
		mntmList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CrisisList.main(null);
			}
		});
		mntmList.setText("List");
		
		MenuItem mntmPolicies = new MenuItem(menu_3, SWT.NONE);
		mntmPolicies.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PoliciesList.main(null);
			}
		});
		mntmPolicies.setText("Policies");

		shlCmss.open();
		shlCmss.layout();
		while (!shlCmss.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
