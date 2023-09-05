use apartman

/****** Object: Table [dbo].[borclar] Script Date: 25.02.2020 01:20:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[borclar](
[id] [int] IDENTITY(1,1) NOT NULL,
[kategori] [nvarchar](50) NULL,
[kullanici] [nvarchar](50) NULL,
[tutar] [decimal](18, 2) NULL,
[aciklama] [nvarchar](150) NULL,
[tarih] [nvarchar](50) NULL,
CONSTRAINT [PK_borclar] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO