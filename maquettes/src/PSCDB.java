import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;


public class PSCDB {

	protected Shell shlPscDatabase;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PSCDB window = new PSCDB();
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
		shlPscDatabase.open();
		shlPscDatabase.layout();
		while (!shlPscDatabase.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlPscDatabase = new Shell();
		shlPscDatabase.setSize(210, 150);
		shlPscDatabase.setText("PSC Database");
		shlPscDatabase.setLayout(new FormLayout());
		
		Label lblPolicemen = new Label(shlPscDatabase, SWT.NONE);
		FormData fd_lblPolicemen = new FormData();
		fd_lblPolicemen.bottom = new FormAttachment(100, -90);
		fd_lblPolicemen.left = new FormAttachment(0, 10);
		lblPolicemen.setLayoutData(fd_lblPolicemen);
		lblPolicemen.setText("Policemen :");
		
		Label lblPoliceCars = new Label(shlPscDatabase, SWT.NONE);
		FormData fd_lblPoliceCars = new FormData();
		fd_lblPoliceCars.bottom = new FormAttachment(100, -57);
		fd_lblPoliceCars.top = new FormAttachment(lblPolicemen, 19);
		fd_lblPoliceCars.left = new FormAttachment(lblPolicemen, 0, SWT.LEFT);
		lblPoliceCars.setLayoutData(fd_lblPoliceCars);
		lblPoliceCars.setText("Police cars :");
		
		text = new Text(shlPscDatabase, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(lblPolicemen, -3, SWT.TOP);
		fd_text.left = new FormAttachment(lblPolicemen, 16);
		text.setLayoutData(fd_text);
		
		text_1 = new Text(shlPscDatabase, SWT.BORDER);
		fd_text.right = new FormAttachment(text_1, 0, SWT.RIGHT);
		FormData fd_text_1 = new FormData();
		fd_text_1.top = new FormAttachment(lblPoliceCars, -3, SWT.TOP);
		fd_text_1.left = new FormAttachment(lblPoliceCars, 14);
		text_1.setLayoutData(fd_text_1);
		
		Button btnCancel = new Button(shlPscDatabase, SWT.NONE);
		FormData fd_btnCancel = new FormData();
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("Cancel");
		
		Button btnNewButton = new Button(shlPscDatabase, SWT.NONE);
		fd_text_1.right = new FormAttachment(btnNewButton, 10, SWT.RIGHT);
		fd_btnCancel.top = new FormAttachment(btnNewButton, 0, SWT.TOP);
		fd_btnCancel.right = new FormAttachment(btnNewButton, -6);
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.bottom = new FormAttachment(100, -10);
		fd_btnNewButton.left = new FormAttachment(0, 121);
		btnNewButton.setLayoutData(fd_btnNewButton);
		btnNewButton.setText("OK");

	}
}
