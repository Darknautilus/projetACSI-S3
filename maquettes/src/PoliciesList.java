import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;


public class PoliciesList {

	protected Shell shlPoliciesList;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PoliciesList window = new PoliciesList();
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
		shlPoliciesList.open();
		shlPoliciesList.layout();
		while (!shlPoliciesList.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlPoliciesList = new Shell();
		shlPoliciesList.setSize(450, 300);
		shlPoliciesList.setText("Policies list");
		shlPoliciesList.setLayout(new FormLayout());
		
		table = new Table(shlPoliciesList, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -52);
		fd_table.left = new FormAttachment(0, 10);
		fd_table.right = new FormAttachment(0, 440);
		fd_table.top = new FormAttachment(0, 26);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");
		
		TableColumn tblclmnType = new TableColumn(table, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Crisis Type");
		
		TableColumn tblclmnInformations = new TableColumn(table, SWT.NONE);
		tblclmnInformations.setWidth(225);
		tblclmnInformations.setText("Informations");
		
		Button btnNewButton = new Button(shlPoliciesList, SWT.NONE);
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.bottom = new FormAttachment(100, -10);
		fd_btnNewButton.left = new FormAttachment(0, 172);
		btnNewButton.setLayoutData(fd_btnNewButton);
		btnNewButton.setText("New Policy");

	}

}
