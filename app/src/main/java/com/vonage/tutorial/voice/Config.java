package com.vonage.tutorial.voice;

public class Config {

    public static User getAlice() {
        return new User(
                "Alice",
                "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2MDg2Mjk2MDcsImp0aSI6ImJlYzc5M2UwLTQ0MzgtMTFlYi04ODRiLTkxODY5ZmJlODEzZSIsImV4cCI6MTYwODcxNjAwNywiYWNsIjp7InBhdGhzIjp7Ii8qL3VzZXJzLyoqIjp7fSwiLyovY29udmVyc2F0aW9ucy8qKiI6e30sIi8qL3Nlc3Npb25zLyoqIjp7fSwiLyovZGV2aWNlcy8qKiI6e30sIi8qL2ltYWdlLyoqIjp7fSwiLyovbWVkaWEvKioiOnt9LCIvKi9hcHBsaWNhdGlvbnMvKioiOnt9LCIvKi9wdXNoLyoqIjp7fSwiLyova25vY2tpbmcvKioiOnt9fX0sImFwcGxpY2F0aW9uX2lkIjoiMzU0ZmM0ZDktNTYyYy00YzA1LWIzZWQtYjMxYWMyOTM3ZjE5Iiwic3ViIjoiQWxpY2UifQ.CbQyOZ3A8wQHftP9Ix4kfD7qHXpjKFePjpE3S8jdfIQHXPRbD_zEAhU5gMVMdUU0CtjjeiDsEW8Xpvr5vFlIv0n4twtCii3v1X98M73-E1D2pDsie0lu-f6Tr_rA0pMxdhBtANU4Ugmvsgi2DbMj8PcNsFSPkaXIgsvTsPFihhqTMNRGQMAJOAdFEQJpXUAOPMhvN8UfrA3reNlZQwH__FmxD7vbcFK_mx3oxOSgWfjtCdQpHjDIcQXi0Ljr-EdBmlmKaa0Gr4snqQw9l6yT_O29sEUqkJn5WX6rPJN5oRKxxW4VHJcQQCfIA5BeT3OS99PeaOJzPcnke5R7WiojJA" // TODO: "set Bob JWT token"
        );
    }

    public static User getBob() {
        return new User(
                "Bob",
                "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2MDg2Mjk2MjQsImp0aSI6ImM4YWVmYTYwLTQ0MzgtMTFlYi1iMDQ5LTliMmFjZDA3M2JlMyIsImV4cCI6MTYwODcxNjAyMywiYWNsIjp7InBhdGhzIjp7Ii8qL3VzZXJzLyoqIjp7fSwiLyovY29udmVyc2F0aW9ucy8qKiI6e30sIi8qL3Nlc3Npb25zLyoqIjp7fSwiLyovZGV2aWNlcy8qKiI6e30sIi8qL2ltYWdlLyoqIjp7fSwiLyovbWVkaWEvKioiOnt9LCIvKi9hcHBsaWNhdGlvbnMvKioiOnt9LCIvKi9wdXNoLyoqIjp7fSwiLyova25vY2tpbmcvKioiOnt9fX0sImFwcGxpY2F0aW9uX2lkIjoiMzU0ZmM0ZDktNTYyYy00YzA1LWIzZWQtYjMxYWMyOTM3ZjE5Iiwic3ViIjoiQm9iIn0.eKYmxIfp_xiUEcO0UtnprSHSN283za3qAl-rmuklfNXIZrmFPc7TEuKSfbvDtPCzw1Y35IZbT_ZIqBDbd_n1OZLuLmpQobXKxlTSefpZUu31RFt66FyRMi0aUsZegrR_HKifgNI0z6TJh8afGE4qAHbFcjZutNS56Nvn0Ji0GP9FkcCsAcs7_8pfxN9IGLw8d59YCN5FcYZHpZb6pnuj9sGQybYs9W8L-XEjRkpgSvBTTQEkBWU4ZfbzxgNix8r62Z0avlnnlCgQlVgOPdrYN19yFDVPSgVtFF7X-_dHm0SV1FSpdeJyL455Z7KIcSWRnkAhQMYawtrCdHyhfkBTcA" // TODO: "set Bob JWT token"
        );
    }
}
