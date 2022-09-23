library(baseballr)
library(tidyverse)
library(dplyr)

MikeTroutTable <- read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/TroutFangraphs.csv')

MikeTroutSeaonStats2019 <- MikeTroutTable[9, ]
colnames(MikeTroutSeaonStats2019)[20] <- "wrcPlus"

MikeTroutName <- data_frame("Mike Trout")
colnames(MikeTroutName)[1] <- "Name"

MikeTroutHitterQuality <- MikeTroutSeaonStats2019[ , 20]
colnames(MikeTroutHitterQuality)[1] <- "HitterQuality"

MikeTroutFangraphsExport <- data.frame(MikeTroutName,MikeTroutSeaonStats2019, MikeTroutHitterQuality)
MikeTroutFangraphsExport$Off <-  NULL
MikeTroutFangraphsExport$Def <-  NULL
MikeTroutFangraphsExport$Off <-  NULL
MikeTroutFangraphsExport$BsR <-  NULL
MikeTroutFangraphsExport$wOBA <-  NULL
MikeTroutFangraphsExport$xwOBA <-  NULL
MikeTroutFangraphsExport$BABIP <-  NULL
MikeTroutFangraphsExport$ISO <-  NULL

view(MikeTroutFangraphsExport)
#write.csv(MikeTroutFangraphsExport, file = "/Users/nolenconner/Desktop/Project/R/FangraphsTest/MikeTroutSeaonStats2019two.csv")
#write.csv(MikeTroutFangraphsExport, file = "/Users/nolenconner/Desktop/Project/MikeTroutSeaonStats2019two.csv")

