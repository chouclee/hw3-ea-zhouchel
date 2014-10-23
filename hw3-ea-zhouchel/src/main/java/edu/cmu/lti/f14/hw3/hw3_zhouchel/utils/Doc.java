package edu.cmu.lti.f14.hw3.hw3_zhouchel.utils;

import java.util.HashMap;

public class Doc implements Comparable<Doc>{
  public HashMap<String, Integer> docVector;
  public int queryId;
  public int relevance;
  public double score;
  public String text;
  public int docLength;
  
  public Doc() {
    docVector = new HashMap<String, Integer>();
    queryId = 0;
    relevance = 0;
    score = 0.0;
    docLength = 0;
  }
  
  public Doc(int queryId, int relevance, String text, HashMap<String, Integer> docVector) {
    this.queryId = queryId;
    this.text = text;
    this.docVector = docVector;
    this.relevance = relevance;
    this.docLength = 0;
    
    for (String token : docVector.keySet())
      this.docLength += docVector.get(token);
  }

  public int compareTo(Doc o) {
    // TODO Auto-generated method stub
    if (this.score > o.score)
      return -1;
    if (this.score < o.score)
      return +1;
    return 0;
  }
}
