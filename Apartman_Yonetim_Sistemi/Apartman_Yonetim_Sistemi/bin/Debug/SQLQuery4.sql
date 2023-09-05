use apartman 

/****** Object: Table [dbo].[apartman_islemleri] Script Date: 25.02.2020 01:19:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[apartman_islemleri](
[id] [int] IDENTITY(1,1) NOT NULL,
[apartman_adi] [nvarchar](50) NULL,
[blok] [nvarchar](50) NULL,
[adres] [nvarchar](150) NULL,
[daire_sayisi] [tinyint] NULL,
[yonetici_id] [int] NULL,
CONSTRAINT [PK_apartman_islemleri] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO