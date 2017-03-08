package OnlineSolution;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InventoryGUI extends JFrame
{
	private JPanel top;
	private JLabel lblTop;
	private JPanel dataView;
	private GroupLayout group;
	private JLabel lblPartnum;
	private JTextField txtPartnum;
	private JLabel lblItem;
	//private JComboBox cmbItem; // add later
	private JTextField txtItem;
	private JLabel lblDescription;
	private JTextArea txtDescription;
	private JScrollPane scrollDesc;
	private JLabel lblQty;
	private JTextField txtQty;
	private JLabel lblPrice;
	private JTextField txtPrice;
	private JLabel lblTotal;
	private JPanel buttons;
	private JButton btnNext;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnAdd;
	private JButton btnPrevious;
	private JButton btnSave;
	private JButton btnCancel;

	private boolean editing = false;

	public InventoryGUI()
	{
            super("Inventory");
            super.setSize(600,400);
            initComponents();
	}

	private void initComponents()
	{
            // top
            top = new JPanel();
            lblTop = new JLabel("Inventory Control Program - Inventory Items");
                    lblTop.setHorizontalAlignment(SwingConstants.CENTER);
                    lblTop.setFont(new Font("Tahoma", 1, 12));
            top.add(lblTop);

            this.add(top,BorderLayout.PAGE_START);

            // center
            lblPartnum = new JLabel("Part #:");
                    lblPartnum.setHorizontalAlignment(SwingConstants.RIGHT);
            txtPartnum = new JTextField();
                    txtPartnum.setEditable(false);
            lblItem = new JLabel("Item:");
                    lblItem.setHorizontalAlignment(SwingConstants.RIGHT);
            txtItem = new JTextField();
                    txtItem.setEditable(false);
            lblDescription = new JLabel("Description:");
                    lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
            txtDescription = new JTextArea();
                    txtDescription.setEditable(false);
            scrollDesc = new JScrollPane(txtDescription);
                    scrollDesc.setViewportView(txtDescription);
            lblQty = new JLabel("Quantity:");
                    lblQty.setHorizontalAlignment(SwingConstants.RIGHT);
            txtQty = new JTextField();
                    txtQty.setEditable(false);
            lblPrice = new JLabel("Price/each:");
                    lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
            txtPrice = new JTextField();
                    txtPrice.setEditable(false);
            lblTotal = new JLabel("Total:");
                    lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);

            // center panel
            dataView = new JPanel();

            // group layout
            group = new GroupLayout(dataView);
                    group.setAutoCreateGaps(true);
                    group.setAutoCreateContainerGaps(true);
            dataView.setLayout(group);

            // group layout HORIZONTAL
            group.setHorizontalGroup(group.createSequentialGroup()
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPartnum)
                            .addComponent(lblItem)
                            .addComponent(lblDescription)
                            .addComponent(lblQty)
                            .addComponent(lblPrice))
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(scrollDesc)
                            .addGroup(group.createSequentialGroup()
                                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPartnum, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtItem, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQty, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(group.createSequentialGroup()
                                                    .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblTotal)))))
                    );

            // group layout VERTICAL
            group.setVerticalGroup(group.createSequentialGroup()
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPartnum)
                            .addComponent(txtPartnum))
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem)
                            .addComponent(txtItem))
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescription)
                            .addComponent(scrollDesc))
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQty)
                            .addComponent(txtQty))
                    .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice)
                            .addComponent(lblTotal))
                            );

            this.add(dataView, BorderLayout.CENTER);

            // bottom
            buttons = new JPanel();

            btnNext = new JButton("Next");
            btnPrevious = new JButton("Previous");
            btnAdd = new JButton("Add");
            btnEdit = new JButton("Edit");
            btnDelete = new JButton("Delete");
            btnSave = new JButton("Save");
                    btnSave.setEnabled(false);
            btnCancel = new JButton("Cancel");
                    btnCancel.setEnabled(false);
            buttons.add(btnNext);
            buttons.add(btnPrevious);
            buttons.add(btnAdd);
            buttons.add(btnEdit);
            buttons.add(btnDelete);
            buttons.add(btnSave);
            buttons.add(btnCancel);

            this.add(buttons,BorderLayout.PAGE_END);

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	// methods for Controller to create listeners
    public void addNextButtonActionListener(ActionListener listener)
    {
        btnNext.addActionListener(listener);
    }
    public void addPrevButtonActionListener(ActionListener listener)
    {
        btnPrevious.addActionListener(listener);
    }

     public void addAddButtonActionListener(ActionListener listener)
    {
        btnAdd.addActionListener(listener);
    }   

     public void addSaveButtonActionListener(ActionListener listener)
    {
        btnSave.addActionListener(listener);
    }  

     public void addCancelButtonActionListener(ActionListener listener)
    {
        btnCancel.addActionListener(listener);
    } 

     public void addEditButtonActionListener(ActionListener listener)
    {
        btnEdit.addActionListener(listener);
    }   

     public void addDeleteButtonActionListener(ActionListener listener)
    {
        btnDelete.addActionListener(listener);
    }

    // methods for Controller class to set/get text fields
    public void setPartnum(String partnum)
	{
		txtPartnum.setText(partnum);
	}

	public String getPartnum() { return txtPartnum.getText(); }

	public void setItem(String item)
	{
		txtItem.setText(item);
	}
	public String getItem() { return txtItem.getText(); }

	public void setDescription(String desc)
	{
		txtDescription.setText(desc);
	}
	public String getDescription() { return txtDescription.getText(); }

	public void setQty(int qty)
	{
		txtQty.setText("" + qty);
	}
	public String getQty() { return txtQty.getText(); }

	public void setPrice(float price)
	{
		txtPrice.setText(String.format("%,.2f", price));
	}
	public String getPrice() { return txtPrice.getText(); }

	public void setTotal(float total)
	{
		lblTotal.setText(String.format("Total:  %,.2f",total));
	}

	public void setEditing(boolean b)
	{
		editing = b;
		setButtonsForEdit();
	}

	public boolean isEditing() { return editing; }

	public void setButtonsForEdit()
	{
		if (editing)
		{
			btnNext.setEnabled(false);
			btnPrevious.setEnabled(false);
			btnAdd.setEnabled(false);
			btnEdit.setEnabled(false);
			btnDelete.setEnabled(false);
			btnSave.setEnabled(true);
			btnCancel.setEnabled(true);

			txtItem.setEditable(true);
			txtDescription.setEditable(true);
			txtQty.setEditable(true);
			txtPrice.setEditable(true);

			txtItem.requestFocusInWindow();
			txtItem.selectAll();
		}
		else
		{
			btnNext.setEnabled(true);
			btnPrevious.setEnabled(true);
			btnAdd.setEnabled(true);
			btnEdit.setEnabled(true);
			btnDelete.setEnabled(true);
			btnSave.setEnabled(false);
			btnCancel.setEnabled(false);

			txtItem.setEditable(false);
			txtDescription.setEditable(false);
			txtQty.setEditable(false);
			txtPrice.setEditable(false);

			btnNext.requestFocusInWindow();
		}

	}


}