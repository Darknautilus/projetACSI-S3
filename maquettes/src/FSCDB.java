import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;


public class FSCDB {

	protected Shell shlFscDatabase;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FSCDB window = new FSCDB();
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
		shlFscDatabase.open();
		shlFscDatabase.layout();
		while (!shlFscDatabase.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFscDatabase = new Shell();
		shlFscDatabase.setSize(219, 158);
		shlFscDatabase.setText("FSC Database");
		
		text = new Text(shlFscDatabase, SWT.BORDER);
		text.setBounds(96, 62, 85, 19);
		
		Label lblFiremen = new Label(shlFscDatabase, SWT.NONE);
		lblFiremen.setText("Firemen :");
		lblFiremen.setBounds(10, 32, 66, 14);
		
		text_1 = new Text(shlFscDatabase, SWT.BORDER);
		text_1.setBounds(96, 29, 85, 19);
		
		Label lblFireTrucks = new Label(shlFscDatabase, SWT.NONE);
		lblFireTrucks.setText("Fire trucks :");
		lblFireTrucks.setBounds(10, 65, 68, 14);
		
		Button button = new Button(shlFscDatabase, SWT.NONE);
		button.setText("OK");
		button.setBounds(119, 98, 48, 28);
		
		Button button_1 = new Button(shlFscDatabase, SWT.NONE);
		button_1.setText("Cancel");
		button_1.setBounds(45, 98, 68, 28);

	}

}
