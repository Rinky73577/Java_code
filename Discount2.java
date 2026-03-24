public class Discount2{
    public static void main(String[]args){
        int s1 = 99, s2 = 399, s3 = 599;
        int p1 = 999, p2 = 3999, p3 = 99;

        int sTotal = s1 + s2 + s3;
        int pTotal = p1 + p2 + p3;

        float sDis = 0.0f;
        float pDis = 0.0f;

        boolean flag1 = false;
        boolean flag2 = false;

        Float grandTotal = 0.0f;

        if(sTotal >= 2000 && sTotal < 2500){sDis = 0.20f * sTotal;}
        else if(sTotal >= 2500 && sTotal < 3000){sDis = 0.25f * sTotal;}
        else if(sTotal >= 3000 && sTotal < 3500){sDis = 0.30f * sTotal;}
        else if(sTotal >= 3500){sDis = 0.35f * sTotal;
            flag1 = true;
        }
        System.out.println("Shirt Total: " + sTotal);
        System.out.println("Shirt Discount: " + sDis);

        if(pTotal >= 4000 && pTotal < 5000){pDis = 0.30f * pTotal;}
        else if(pTotal >= 5000 && pTotal < 6000){pDis = 0.40f * pTotal;}
        else if(pTotal >= 6000 && pTotal < 7000){pDis = 0.50f * pTotal;}
        else if(pTotal >= 7000){pDis = 0.65f * pTotal;
            flag2 = true;
        }
        System.out.println("Pant Total: " + pTotal);
        System.out.println("Pant Discount: " + pDis);

        float discount = sDis + pDis;

        if(flag1 && flag2)
            {discount = 0.05f * discount;}

        float grandTotal2 = (sTotal + pTotal) - discount;

        System.out.println("GrandTotal: " + grandTotal2);
    }
}