use apartman

/****** Object: Table [dbo].[daire] Script Date: 25.02.2020 01:20:33 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[daire](
[id] [int] IDENTITY(1,1) NOT NULL,
[tipi] [nvarchar](50) NULL,
[kira] [decimal](18, 2) NULL,
[aidat] [decimal](18, 2) NULL,
[apartman_id] [int] NOT NULL,
[daire_no] [nvarchar](50) NULL,
CONSTRAINT [PK_daire] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO

ALTER TABLE [dbo].[daire] WITH CHECK ADD FOREIGN KEY([apartman_id])
REFERENCES [dbo].[apartman_islemleri] ([id])
GO

