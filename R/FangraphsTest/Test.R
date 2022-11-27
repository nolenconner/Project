library(tidyverse)
library(dplyr)

FangraphsHitterData <-  read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/FanGraphsHitterLeaderboard.csv')
colnames(FangraphsHitterData)[20] <- "wrcPlus"

innings = readline(prompt = "Minimum Innings Pitched")
innings = as.integer(innings)

inningSort <- function(IP){
  FangraphsHitterData <- FangraphsHitterData[FangraphsHitterData$PA >= IP, ]
  total <- nrow(FangraphsHitterData)
  FangraphsHitterData <- arrange(FangraphsHitterData, desc(wrcPlus))
}

hitter = readline(prompt = "Hitter Name")

hitterSort <- function(hit){
  rank <- which(FangraphsHitterData$Name == hitter)
}

inningSort(innings)
hitterSort(hitter)
percentile <- ((total - rank) / total) * 100








