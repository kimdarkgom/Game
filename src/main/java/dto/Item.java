package dto;

public class Item {

        private  int id;
        private  String name;
        private  String att;
        private  int dmg;
        private  String eff;

        public int getDmg() {
            return dmg;
        }

        public void setDmg(int dmg) {
            this.dmg = dmg;
        }

        public String getEff() {
            return eff;
        }

        public void setEff(String eff) {
            this.eff = eff;
        }

        public String getAtt() {
            return att;
        }

        public void setAtt(String att) {
            this.att = att;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  void  setId(int id){
            this.id = id;
        }
        public  int  getId(){
            return id;
        }
}


