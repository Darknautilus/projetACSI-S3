import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FillLayout;
import swing2swt.layout.BoxLayout;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


public class main {

	protected Shell shlCmss;
	private Table table;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			main window = new main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCmss.open();
		shlCmss.layout();
		while (!shlCmss.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCmss = new Shell();
		shlCmss.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		shlCmss.setSize(564, 241);
		shlCmss.setText("CMSS");
		shlCmss.setLayout(null);
		
		Menu menu = new Menu(shlCmss, SWT.BAR);
		shlCmss.setMenuBar(menu);
		
		MenuItem mntmFichier_1 = new MenuItem(menu, SWT.CASCADE);
		mntmFichier_1.setText("File");
		
		Menu menu_1 = new Menu(mntmFichier_1);
		mntmFichier_1.setMenu(menu_1);
		
		MenuItem mntmInformations = new MenuItem(menu_1, SWT.NONE);
		mntmInformations.setText("Informations");
		
		MenuItem mntmQuitter = new MenuItem(menu_1, SWT.NONE);
		mntmQuitter.setText("Quit");
		
		MenuItem mntmPsc = new MenuItem(menu, SWT.CASCADE);
		mntmPsc.setText("Databases");
		
		Menu menu_2 = new Menu(mntmPsc);
		mntmPsc.setMenu(menu_2);
		
		MenuItem mntmBaseDeDonnes = new MenuItem(menu_2, SWT.NONE);
		mntmBaseDeDonnes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FSCDB.main(null);
			}
		});
		mntmBaseDeDonnes.setText("FSC");
		
		MenuItem mntmPsc_1 = new MenuItem(menu_2, SWT.NONE);
		mntmPsc_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PSCDB.main(null);
			}
		});
		mntmPsc_1.setText("PSC");
		
		MenuItem mntmCrise = new MenuItem(menu, SWT.CASCADE);
		mntmCrise.setText("Crisis");
		
		Menu menu_3 = new Menu(mntmCrise);
		mntmCrise.setMenu(menu_3);
		
		MenuItem mntmNew = new MenuItem(menu_3, SWT.NONE);
		mntmNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				NewCrisis.main(null);
			}
		});
		mntmNew.setText("New");
		
		MenuItem mntmListeCrises = new MenuItem(menu_3, SWT.NONE);
		mntmListeCrises.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CrisisList.main(null);
			}
		});
		mntmListeCrises.setText("List");
		
		MenuItem mntmPolicies = new MenuItem(menu_3, SWT.NONE);
		mntmPolicies.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PoliciesList.main(null);
			}
		});
		mntmPolicies.setText("Policies");
		
		Group grpCurrentCrisis = new Group(shlCmss, SWT.NONE);
		grpCurrentCrisis.setText("Current crisis");
		grpCurrentCrisis.setBounds(10, 10, 544, 194);
		formToolkit.adapt(grpCurrentCrisis);
		formToolkit.paintBordersFor(grpCurrentCrisis);
		
		Button btnNewButton = new Button(grpCurrentCrisis, SWT.NONE);
		btnNewButton.setBounds(199, 134, 93, 33);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				NewCrisis.main(null);
			}
		});
		btnNewButton.setText("New crisis");
		
		table = new Table(grpCurrentCrisis, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 10, 520, 107);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(84);
		tblclmnNewColumn.setText("Crisis number");
		
		TableColumn tblclmnType = new TableColumn(table, SWT.NONE);
		tblclmnType.setWidth(71);
		tblclmnType.setText("Type");
		
		TableColumn tblclmnLabel = new TableColumn(table, SWT.NONE);
		tblclmnLabel.setWidth(100);
		tblclmnLabel.setText("Label");
		
		TableColumn tblclmnPlace = new TableColumn(table, SWT.NONE);
		tblclmnPlace.setWidth(100);
		tblclmnPlace.setText("Place");
		
		TableColumn tblclmnState = new TableColumn(table, SWT.NONE);
		tblclmnState.setWidth(100);
		tblclmnState.setText("State");
		
		TableColumn tblclmnDetails = new TableColumn(table, SWT.NONE);
		tblclmnDetails.setWidth(100);
		tblclmnDetails.setText("Details");


	}
}
