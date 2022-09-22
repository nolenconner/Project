library(baseballr)
library(tidyverse)
library(dplyr)
MikeTroutTable <- read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/TroutFangraphs.csv')
MikeTroutSeaonStats2019 <- MikeTroutTable[9, ]
colnames(MikeTroutSeaonStats2019)[20] <- "wrcPlus"
MikeTroutName <- data_frame("Mike Trout")
colnames(MikeTroutName)[1] <- "name"
MikeTroutHitterQuality <- MikeTroutSeaonStats2019[ , 20]
colnames(MikeTroutHitterQuality)[1] <- "HitterQuality"
MikeTroutFangraphsExport <- data.frame(MikeTroutName,MikeTroutSeaonStats2019, MikeTroutHitterQuality)
view(MikeTroutFangraphsExport)



