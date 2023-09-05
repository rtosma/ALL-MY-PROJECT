namespace Apartman_Yonetim_Sistemi
{
    partial class Loglar
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBox15 = new System.Windows.Forms.TextBox();
            this.label26 = new System.Windows.Forms.Label();
            this.dataGridView7 = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView7)).BeginInit();
            this.SuspendLayout();
            // 
            // textBox15
            // 
            this.textBox15.BackColor = System.Drawing.Color.Azure;
            this.textBox15.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.55F);
            this.textBox15.Location = new System.Drawing.Point(588, 24);
            this.textBox15.Name = "textBox15";
            this.textBox15.Size = new System.Drawing.Size(94, 20);
            this.textBox15.TabIndex = 23;
            this.textBox15.TextChanged += new System.EventHandler(this.textBox15_TextChanged);
            // 
            // label26
            // 
            this.label26.AutoSize = true;
            this.label26.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.55F);
            this.label26.ForeColor = System.Drawing.Color.DarkCyan;
            this.label26.Location = new System.Drawing.Point(539, 24);
            this.label26.Name = "label26";
            this.label26.Size = new System.Drawing.Size(43, 15);
            this.label26.TabIndex = 22;
            this.label26.Text = "Arama";
            // 
            // dataGridView7
            // 
            this.dataGridView7.BackgroundColor = System.Drawing.Color.Azure;
            this.dataGridView7.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView7.Location = new System.Drawing.Point(65, 50);
            this.dataGridView7.Name = "dataGridView7";
            this.dataGridView7.Size = new System.Drawing.Size(617, 354);
            this.dataGridView7.TabIndex = 21;
            // 
            // Loglar
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(768, 428);
            this.Controls.Add(this.textBox15);
            this.Controls.Add(this.label26);
            this.Controls.Add(this.dataGridView7);
            this.Font = new System.Drawing.Font("Verdana", 8.25F);
            this.Name = "Loglar";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Loglar";
            this.Load += new System.EventHandler(this.Loglar_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView7)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox15;
        private System.Windows.Forms.Label label26;
        private System.Windows.Forms.DataGridView dataGridView7;
    }
}