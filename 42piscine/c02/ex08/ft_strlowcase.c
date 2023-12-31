/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlowcase.c                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/25 14:52:57 by rosma             #+#    #+#             */
/*   Updated: 2023/07/25 15:00:19 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */

char	*ft_strlowcase(char *str)
{
	int	k;

	k = 0;
	while (str[k] != '\0')
	{
		if (str[k] >= 'A' && str[k] <= 'Z')
		{
			str[k] += 32;
		}
		k++;
	}
	return (str);
}
