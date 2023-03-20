package com.kjj.scraper;

import com.kjj.model.Company;
import com.kjj.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
