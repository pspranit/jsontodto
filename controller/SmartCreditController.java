package com.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.dto.BundleComponent;
import com.dto.Bureau;
import com.dto.CreditScoreFactor;
import com.dto.CreditScoreModel;
import com.dto.CreditScoreType;
import com.dto.Factor;
import com.dto.FactorText;
import com.dto.NoScoreReason;
import com.dto.Root;
import com.dto.Source;
import com.google.gson.Gson;

public class SmartCreditController {

	public static Root getJsonFile() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Downloads/smart_credit.json"));
		String line;
		StringBuffer sbuilderObj = new StringBuffer();
		while ((line = br.readLine()) != null)
			sbuilderObj.append(line);
		String json = sbuilderObj.toString();
		Gson gson = new Gson();
		Root creditRoot = gson.fromJson(json, Root.class);
		return creditRoot;
	}

	public static void main(String[] args) throws IOException {
		CreditDao dao=new CreditDao();
		Root creditRoot = SmartCreditController.getJsonFile();
		List<BundleComponent> bundleComponentsList = creditRoot.getBundleComponents().getBundleComponent();
		int rootId=0;
		for (BundleComponent b : bundleComponentsList) {
			if (b.getType() != null) {
				
				System.out.println(b.getType());
				b.setType(b.getType());
//				dao.insertTypes(b);
				
			}
			int creditScoreId=0;
			 if (b.getCreditScoreType() != null) {
				 creditScoreId++;
				CreditScoreType creditScoreType = b.getCreditScoreType();
				System.out.println(creditScoreType.getRiskScore());
				creditScoreType.setRiskScore(creditScoreType.getRiskScore());
				System.out.println(creditScoreType.getScoreName());
				creditScoreType.setScoreName(creditScoreType.getScoreName());
				System.out.println(creditScoreType.getPopulationRank());
				creditScoreType.setPopulationRank(creditScoreType.getPopulationRank());
				creditScoreType.setInquiriesAffectedScore(creditScoreType.getInquiriesAffectedScore());
				System.out.println(creditScoreType.getInquiriesAffectedScore());
				int factorId=0;
				List<CreditScoreFactor> creditScoreFactorsList=b.getCreditScoreType().getCreditScoreFactor();
				for(CreditScoreFactor factor : creditScoreFactorsList)
				{
					factorId++;
					System.out.println(factor.getBureauCode());
					factor.setBureauCode(factor.getBureauCode());
					System.out.println(factor.getFactorType());
					factor.setFactorType(factor.getFactorType());
					Factor factor2=factor.getFactor();
					System.out.println(factor2.getAbbreviation());
					factor2.setAbbreviation(factor2.getAbbreviation());
					System.out.println(factor2.getDescription());
					factor2.setDescription(factor2.getDescription());
					System.out.println(factor2.getSymbol());
					factor2.setSymbol(factor2.getSymbol());
					System.out.println(factor2.getRank());
					factor2.setRank(factor2.getRank());
//					dao.insertCreditScoreFactor(factor,factor2,rootId,fatorId);
					List<FactorText> factorTextsList=factor.getFactorText();
					for(FactorText factorText : factorTextsList)
					{
						System.out.println(factorText.getFactorText());
						factorText.setFactorText(factorText.getFactorText());
//						dao.insertFactorText(factorText,factorId);
					}
					CreditScoreModel creditScoreModel=creditScoreType.getCreditScoreModel();
					System.out.println(creditScoreModel.getAbbreviation());
					creditScoreModel.setAbbreviation(creditScoreModel.getAbbreviation());
					System.out.println(creditScoreModel.getDescription());
					creditScoreModel.setDescription(creditScoreModel.getDescription());
					System.out.println(creditScoreModel.getSymbol());
					creditScoreModel.setSymbol(creditScoreModel.getSymbol());
					System.out.println(creditScoreModel.getRank());
					creditScoreModel.setRank(creditScoreModel.getRank());
					
					NoScoreReason noScoreReason=creditScoreType.getNoScoreReason();
					System.out.println(noScoreReason.getAbbreviation());
					noScoreReason.setAbbreviation(noScoreReason.getAbbreviation());
					System.out.println(noScoreReason.getDescription());
					noScoreReason.setDescription(noScoreReason.getDescription());
					System.out.println(noScoreReason.getSymbol());
					noScoreReason.setSymbol(noScoreReason.getSymbol());
					System.out.println(noScoreReason.getRank());
					noScoreReason.setRank(noScoreReason.getRank());
					
					Source source=creditScoreType.getSource();
					System.out.println(source.getBorrowerKey());
					source.setBorrowerKey(source.getBorrowerKey());
					Bureau bureau=source.getBureau();
					System.out.println(bureau.getAbbreviation());
					bureau.setAbbreviation(bureau.getAbbreviation());
					System.out.println(bureau.getDescription());
					bureau.setDescription(bureau.getDescription());
					System.out.println(bureau.getSymbol());
					bureau.setSymbol(bureau.getSymbol());
					System.out.println(bureau.getRank());
					bureau.setRank(bureau.getRank());
					System.out.println(source.getInquiryDate());
					source.setInquiryDate(source.getInquiryDate());
					System.out.println(source.getReference());
					source.setReference(source.getReference());
//					dao.insertSource(source,creditScoreId);
					
//					dao.insertCreditScoreType(creditScoreType,creditScoreModel,noScoreReason,creditScoreId);
					
					
				}
			}

		}

	}
}