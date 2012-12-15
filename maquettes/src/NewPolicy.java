import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;


public class NewPolicy {

	protected Shell shlNewPolicy;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			NewPolicy window = new NewPolicy();
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
		shlNewPolicy.open();
		shlNewPolicy.layout();
		while (!shlNewPolicy.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlNewPolicy = new Shell();
		shlNewPolicy.setSize(378, 265);
		shlNewPolicy.setText("New Policy");
		shlNewPolicy.setLayout(new FormLayout());
		
		Label lblNewLabel = new Label(shlNewPolicy, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 21);
		fd_lblNewLabel.left = new FormAttachment(0, 20);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Name");
		
		text = new Text(shlNewPolicy, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.left = new FormAttachment(lblNewLabel, 63);
		fd_text.right = new FormAttachment(100, -10);
		text.setLayoutData(fd_text);
		
		Label lblCrisisType = new Label(shlNewPolicy, SWT.NONE);
		fd_lblNewLabel.bottom = new FormAttachment(lblCrisisType, -6);
		FormData fd_lblCrisisType = new FormData();
		fd_lblCrisisType.top = new FormAttachment(0, 62);
		fd_lblCrisisType.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblCrisisType.setLayoutData(fd_lblCrisisType);
		lblCrisisType.setText("Crisis Type");
		
		text_1 = new Text(shlNewPolicy, SWT.BORDER);
		fd_text.bottom = new FormAttachment(100, -203);
		FormData fd_text_1 = new FormData();
		fd_text_1.left = new FormAttachment(lblCrisisType, 35);
		fd_text_1.top = new FormAttachment(text, 21);
		fd_text_1.right = new FormAttachment(100, -10);
		text_1.setLayoutData(fd_text_1);
		
		text_2 = new Text(shlNewPolicy, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.top = new FormAttachment(text_1, 22);
		fd_text_2.right = new FormAttachment(100, -10);
		fd_text_2.bottom = new FormAttachment(0, 161);
		fd_text_2.left = new FormAttachment(0, 118);
		text_2.setLayoutData(fd_text_2);
		
		Button btnCancel = new Button(shlNewPolicy, SWT.NONE);
		FormData fd_btnCancel = new FormData();
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("Cancel");
		
		Button btnOk = new Button(shlNewPolicy, SWT.NONE);
		fd_btnCancel.top = new FormAttachment(btnOk, 0, SWT.TOP);
		fd_btnCancel.right = new FormAttachment(btnOk, -33);
		FormData fd_btnOk = new FormData();
		fd_btnOk.top = new FormAttachment(text_2, 33);
		fd_btnOk.left = new FormAttachment(0, 205);
		btnOk.setLayoutData(fd_btnOk);
		btnOk.setText("OK");
		
		Label lblInformations = new Label(shlNewPolicy, SWT.NONE);
		FormData fd_lblInformations = new FormData();
		fd_lblInformations.top = new FormAttachment(lblCrisisType, 29);
		fd_lblInformations.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblInformations.setLayoutData(fd_lblInformations);
		lblInformations.setText("Informations");

	}
}
