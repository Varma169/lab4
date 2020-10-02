/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class painting {
    import java.util.Scanner;
public class PaintJobEstimator {
	 /* number of rooms
	price of paint per gallon
	square feet of wall per each room
	Approach:
	Total area = number of rooms * square feet of wall per each room
	paint used= Total area/115;
	Labor required 

	perSftTime = 8/115;
	persftcolor= 1/115;

	totalPaintReq = 1/115*totalSft; 
	totalCostOfpaint= totalPaintReq * pricePerGalon;
	totalLabourHours = perSftTime *totalSft;
	totalLaborCharges = totalLabourHours*18;
	totalCost = totalCostOfpaint+totalLaborCharges ; */
	static double baseSft = 115.0;
		public static void main(String[] args) {
			double roomsToBePainted, priceOfPaintPerGallon,squareFeetOfWallSpaceInEachRoom;
			Scanner sc = new Scanner(System.in);
			System.out.println("Numberof rooms to be painted:");
			roomsToBePainted = sc.nextInt();
			double totalSft =0;
			for(int i=0;i<roomsToBePainted;i++) {
				System.out.println("Square Feet Of Wall Space In Each Room:");
				squareFeetOfWallSpaceInEachRoom = sc.nextDouble();
				totalSft = totalSft+squareFeetOfWallSpaceInEachRoom;
			}
			System.out.println("Price of paint per gallon:");
			priceOfPaintPerGallon = sc.nextDouble();
			System.out.println("Total area:"+totalSft);
			sc.close();
			 
			/*double totalPaintReq =gallonsRequired(totalSft);
			double totalHoursOflabour = hoursOfLabourRequired(totalSft);
			double costForPaint =costOfPaint(totalSft,priceOfPaintPerGallon);
			double totalLaborCharges = labourCharges(totalSft);
			double totalCost = totalCostOfPaint(priceOfPaintPerGallon,totalSft);*/
			
			double totalPaintReq =gallonsRequired(totalSft);
			System.out.println("Total Paint Required:"+totalPaintReq+" Gallons");
			double totalHoursOflabour= hoursOfLaborRequired(totalSft);
			System.out.println("Total labour Hours:"+totalHoursOflabour+" Hours");
			double costForPaint=costOfPaint(totalSft, priceOfPaintPerGallon);
			System.out.println("Cost of Paint:"+costForPaint+" $");
			double totalLaborCharges=labourCharges(totalSft);
			System.out.println("Total Labor Charges:"+totalLaborCharges+" $");
			double totalCost =totalCostOfPaint(priceOfPaintPerGallon, totalSft);
			System.out.println("Total cost of Paint Work:" +totalCost+" $");
		}
		static double gallonsRequired(double totalSft) {
			return (1.0/baseSft)*totalSft;
			
		}
		static double hoursOfLaborRequired(double totalSft) {
			return (8.0/baseSft)*totalSft;
			
		}
		static double costOfPaint(double totalSft, double priceOfPaintPerGallon) {
			return (1.0/baseSft)*totalSft*priceOfPaintPerGallon;
			
		} 
		static double labourCharges(double totalSft) {
			return (8.0/baseSft)*totalSft*18;
			
		}
		static double totalCostOfPaint(double priceOfPaintPerGallon, double totalSft) {
			return ((1.0/baseSft)*totalSft*priceOfPaintPerGallon)+((8.0/baseSft)*totalSft*18);
		
		}
	}
}
