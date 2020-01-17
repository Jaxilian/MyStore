/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;

/**
 *
 * @author Jaxca
 */
public class Store extends javax.swing.JFrame {
    static ProductManager pm;

    public Store() { 
        initComponents();
        pm = new ProductManager(SelfReference());
        pm.UpdateEcoNumbers();
        CloseAllFields();

    }
    
    
    public void UpadeEcoLabels(int ecological, int non){
        label_eco.setText("Ecological: " + ecological);
        labal_noneco.setText("Non ecological" + non);
    }

    public void UpdateOutput(String text){
        info_currentFruit.setText("Selected :" + pm.GetCurrentProduct().GetName());
        ta_output.setText("");
        ta_output.setText(text);
    } 
    public void Error(String text){
        info_error.setText("");
        info_error.setText("Error: " + text);
    }
    public Store SelfReference(){
        return this;
    }
    
    
    private void OpenAllFields(){
        tf_fruitID.setEditable(true);
        tf_heritage.setEditable(true);
        tf_name.setEditable(true);
        tf_price.setEditable(true);
        tf_quantity.setEditable(true);
        tf_weight.setEditable(true);
        cb_pricePerWeight.setEnabled(true);
        cb_ecological.setEnabled(true);
    }
    
    private void CloseAllFields(){
        tf_heritage.setEditable(false);
        tf_price.setEditable(false);
        tf_quantity.setEditable(false);
        tf_weight.setEditable(false);
        cb_pricePerWeight.setEnabled(false);
        cb_ecological.setEnabled(false);
    }
    
    public void WeightLayout(){
        OpenAllFields();
        tf_heritage.setEditable(false);
        tf_price.setEditable(false);
        tf_quantity.setEditable(false);
    }
    
    public void SingelLayout(){
        OpenAllFields();
        tf_heritage.setEditable(false);
        tf_price.setEditable(false);
        tf_weight.setEditable(false);
    }
    
    public void TotalCostOfStorage(int amount){
        info_totalCostOfStorage.setText("Cost of storage: " + amount);
    }
    
    public void TotalStorageSize(int amount){
        info_amount.setText("Storage size: " + amount);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_output = new javax.swing.JTextArea();
        tf_fruitID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_heritage = new javax.swing.JTextField();
        cb_ecological = new javax.swing.JCheckBox();
        tf_weight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_quantity = new javax.swing.JTextField();
        cb_pricePerWeight = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btn_AddFruit = new javax.swing.JButton();
        cb_editable = new javax.swing.JCheckBox();
        btn_searchName = new javax.swing.JButton();
        btn_randomFruit = new javax.swing.JButton();
        btn_RemoveFruit = new javax.swing.JButton();
        btn_Sort = new javax.swing.JButton();
        btn_AddToCart = new javax.swing.JButton();
        btn_SearchID = new javax.swing.JButton();
        btn_showAll = new javax.swing.JButton();
        btn_ShowCart = new javax.swing.JButton();
        info_currentFruit = new javax.swing.JLabel();
        info_amount = new javax.swing.JLabel();
        info_totalCostOfStorage = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        btn_cost = new javax.swing.JButton();
        btn_storageSize = new javax.swing.JButton();
        btn_eco = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_highestPrice = new javax.swing.JTextField();
        btn_searchPrice = new javax.swing.JButton();
        btn_Increment = new javax.swing.JButton();
        btn_decrement = new javax.swing.JButton();
        label_eco = new javax.swing.JLabel();
        labal_noneco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_output.setColumns(20);
        ta_output.setRows(5);
        jScrollPane1.setViewportView(ta_output);

        tf_fruitID.setText("0");
        tf_fruitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fruitIDActionPerformed(evt);
            }
        });

        jLabel1.setText("FruitID");

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        tf_price.setText("0");

        jLabel4.setText("Heritage");

        cb_ecological.setText("Ecological");

        tf_weight.setText("0");
        tf_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_weightActionPerformed(evt);
            }
        });

        jLabel5.setText("Weight");

        jLabel6.setText("Quantity");

        tf_quantity.setText("0");
        tf_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityActionPerformed(evt);
            }
        });

        cb_pricePerWeight.setText("Price per weight");

        btn_AddFruit.setText("Add new fruit");
        btn_AddFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddFruitActionPerformed(evt);
            }
        });

        cb_editable.setText("Edit all values");
        cb_editable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_editableActionPerformed(evt);
            }
        });

        btn_searchName.setText("Search name");
        btn_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNameActionPerformed(evt);
            }
        });

        btn_randomFruit.setText("Random fruit");
        btn_randomFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomFruitActionPerformed(evt);
            }
        });

        btn_RemoveFruit.setText("Remove fruit");
        btn_RemoveFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveFruitActionPerformed(evt);
            }
        });

        btn_Sort.setText("Sort fruits");
        btn_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SortActionPerformed(evt);
            }
        });

        btn_AddToCart.setText("Add fruid to cart");
        btn_AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddToCartActionPerformed(evt);
            }
        });

        btn_SearchID.setText("Seach by ID");
        btn_SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchIDActionPerformed(evt);
            }
        });

        btn_showAll.setText("Show all fruits");
        btn_showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllActionPerformed(evt);
            }
        });

        btn_ShowCart.setText("Show cart");
        btn_ShowCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowCartActionPerformed(evt);
            }
        });

        info_currentFruit.setText("Current Fruit Selected: ");

        info_amount.setText("Amount of products:");

        info_totalCostOfStorage.setText("Cost of storage:");

        info_error.setText("Error: None ");

        btn_cost.setText("Update storage cost");
        btn_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_costActionPerformed(evt);
            }
        });

        btn_storageSize.setText("Update storage size");
        btn_storageSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_storageSizeActionPerformed(evt);
            }
        });

        btn_eco.setText("Show only ecological");
        btn_eco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ecoActionPerformed(evt);
            }
        });

        jLabel7.setText("Products cheaper than:");

        tf_highestPrice.setText("0");

        btn_searchPrice.setText("Search");
        btn_searchPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchPriceActionPerformed(evt);
            }
        });

        btn_Increment.setText(">");
        btn_Increment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IncrementActionPerformed(evt);
            }
        });

        btn_decrement.setText("<");
        btn_decrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decrementActionPerformed(evt);
            }
        });

        label_eco.setText("Ecological:");

        labal_noneco.setText("Non Ecological:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(info_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(info_currentFruit, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(info_totalCostOfStorage, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_searchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_randomFruit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_AddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_showAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_ShowCart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labal_noneco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_AddFruit, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(btn_RemoveFruit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_eco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_cost)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_eco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_storageSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_name)
                                            .addComponent(tf_fruitID, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_ecological)
                                            .addComponent(cb_pricePerWeight)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                            .addComponent(tf_weight)
                                            .addComponent(tf_heritage, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_editable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_decrement)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Increment))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_highestPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_searchPrice))
                            .addComponent(jLabel7))
                        .addGap(274, 274, 274))))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_fruitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_ecological))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cb_pricePerWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cb_editable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_heritage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_highestPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_searchPrice))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Increment)
                    .addComponent(btn_decrement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddFruit)
                    .addComponent(btn_searchName)
                    .addComponent(btn_showAll)
                    .addComponent(btn_cost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RemoveFruit)
                    .addComponent(btn_SearchID)
                    .addComponent(btn_AddToCart)
                    .addComponent(btn_storageSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_randomFruit)
                    .addComponent(btn_ShowCart)
                    .addComponent(btn_Sort)
                    .addComponent(btn_eco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info_amount)
                    .addComponent(info_totalCostOfStorage)
                    .addComponent(label_eco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info_currentFruit)
                    .addComponent(info_error)
                    .addComponent(labal_noneco))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_fruitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fruitIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fruitIDActionPerformed

    private void btn_AddFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddFruitActionPerformed
        pm.AddProduct(
            Integer.parseInt(tf_fruitID.getText()),
            Double.parseDouble(tf_quantity.getText()),
            tf_name.getText(),
            tf_heritage.getText(),
            Double.parseDouble(tf_price.getText()),
            Double.parseDouble(tf_weight.getText()),
            cb_pricePerWeight.isSelected(),
            cb_ecological.isSelected());
    }//GEN-LAST:event_btn_AddFruitActionPerformed

    private void tf_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantityActionPerformed

    private void btn_showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllActionPerformed
        pm.ShowAllProducts();
    }//GEN-LAST:event_btn_showAllActionPerformed

    private void btn_RemoveFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveFruitActionPerformed
        pm.RemoveProduct(Integer.parseInt(tf_fruitID.getText()));
    }//GEN-LAST:event_btn_RemoveFruitActionPerformed

    private void btn_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SortActionPerformed
        pm.Sort();
    }//GEN-LAST:event_btn_SortActionPerformed

    private void btn_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNameActionPerformed
        pm.GetProductByName(tf_name.getText());
    }//GEN-LAST:event_btn_searchNameActionPerformed

    private void btn_SearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchIDActionPerformed
        try{
            pm.GetProductByID(Integer.parseInt(tf_fruitID.getText()));
        }
        catch(Exception e){
            info_error.setText("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_SearchIDActionPerformed

    private void btn_randomFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_randomFruitActionPerformed
        pm.GetRandomProduct();
    }//GEN-LAST:event_btn_randomFruitActionPerformed

    private void btn_AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddToCartActionPerformed
        pm.AddProductToCart(Integer.parseInt(tf_quantity.getText()), Double.parseDouble(tf_weight.getText()));
    }//GEN-LAST:event_btn_AddToCartActionPerformed

    private void btn_ShowCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowCartActionPerformed
        pm.ShowCart();
    }//GEN-LAST:event_btn_ShowCartActionPerformed

    private void cb_editableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_editableActionPerformed
        if(cb_editable.isSelected()){
            OpenAllFields();
        }
        else{
            CloseAllFields();
        }
    }//GEN-LAST:event_cb_editableActionPerformed

    private void tf_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_weightActionPerformed

    private void btn_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_costActionPerformed
        pm.TotalCostOfStorage();
    }//GEN-LAST:event_btn_costActionPerformed

    private void btn_storageSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_storageSizeActionPerformed
        pm.TotalAmountOfProducts();
    }//GEN-LAST:event_btn_storageSizeActionPerformed

    private void btn_ecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ecoActionPerformed
        pm.ShowAllEcological();
    }//GEN-LAST:event_btn_ecoActionPerformed

    private void btn_searchPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchPriceActionPerformed
        pm.SearchLowestPrice(Double.parseDouble(tf_highestPrice.getText()));
    }//GEN-LAST:event_btn_searchPriceActionPerformed

    private void btn_IncrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IncrementActionPerformed
        pm.Increment();
    }//GEN-LAST:event_btn_IncrementActionPerformed

    private void btn_decrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decrementActionPerformed
        pm.Decrement();
    }//GEN-LAST:event_btn_decrementActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddFruit;
    private javax.swing.JButton btn_AddToCart;
    private javax.swing.JButton btn_Increment;
    private javax.swing.JButton btn_RemoveFruit;
    private javax.swing.JButton btn_SearchID;
    private javax.swing.JButton btn_ShowCart;
    private javax.swing.JButton btn_Sort;
    private javax.swing.JButton btn_cost;
    private javax.swing.JButton btn_decrement;
    private javax.swing.JButton btn_eco;
    private javax.swing.JButton btn_randomFruit;
    private javax.swing.JButton btn_searchName;
    private javax.swing.JButton btn_searchPrice;
    private javax.swing.JButton btn_showAll;
    private javax.swing.JButton btn_storageSize;
    private javax.swing.JCheckBox cb_ecological;
    private javax.swing.JCheckBox cb_editable;
    private javax.swing.JCheckBox cb_pricePerWeight;
    private javax.swing.JLabel info_amount;
    private javax.swing.JLabel info_currentFruit;
    private javax.swing.JLabel info_error;
    private javax.swing.JLabel info_totalCostOfStorage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labal_noneco;
    private javax.swing.JLabel label_eco;
    private javax.swing.JTextArea ta_output;
    private javax.swing.JTextField tf_fruitID;
    private javax.swing.JTextField tf_heritage;
    private javax.swing.JTextField tf_highestPrice;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_quantity;
    private javax.swing.JTextField tf_weight;
    // End of variables declaration//GEN-END:variables
}
