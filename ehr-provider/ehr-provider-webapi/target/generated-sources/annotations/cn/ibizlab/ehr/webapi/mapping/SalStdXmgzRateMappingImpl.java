package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdXmgzRate;
import cn.ibizlab.ehr.webapi.dto.SalStdXmgzRateDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdXmgzRateMappingImpl implements SalStdXmgzRateMapping {

    @Override
    public SalStdXmgzRate toDomain(SalStdXmgzRateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdXmgzRate salStdXmgzRate = new SalStdXmgzRate();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdXmgzRate.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdXmgzRate.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJxgzbl() != null ) {
            salStdXmgzRate.setJxgzbl( dto.getJxgzbl() );
        }
        if ( dto.getSalstdxmgzratename() != null ) {
            salStdXmgzRate.setSalstdxmgzratename( dto.getSalstdxmgzratename() );
        }
        if ( dto.getKhjl() != null ) {
            salStdXmgzRate.setKhjl( dto.getKhjl() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdXmgzRate.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdXmgzRate.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalstdxmgzrateid() != null ) {
            salStdXmgzRate.setSalstdxmgzrateid( dto.getSalstdxmgzrateid() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdXmgzRate.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdXmgzRate.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            salStdXmgzRate.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            salStdXmgzRate.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdXmgzRate.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdXmgzRate;
    }

    @Override
    public SalStdXmgzRateDTO toDto(SalStdXmgzRate entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdXmgzRateDTO salStdXmgzRateDTO = new SalStdXmgzRateDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdXmgzRateDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdXmgzRateDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJxgzbl() != null ) {
            salStdXmgzRateDTO.setJxgzbl( entity.getJxgzbl() );
        }
        if ( entity.getSalstdxmgzratename() != null ) {
            salStdXmgzRateDTO.setSalstdxmgzratename( entity.getSalstdxmgzratename() );
        }
        if ( entity.getKhjl() != null ) {
            salStdXmgzRateDTO.setKhjl( entity.getKhjl() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdXmgzRateDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdXmgzRateDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalstdxmgzrateid() != null ) {
            salStdXmgzRateDTO.setSalstdxmgzrateid( entity.getSalstdxmgzrateid() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdXmgzRateDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdXmgzRateDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            salStdXmgzRateDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            salStdXmgzRateDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdXmgzRateDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdXmgzRateDTO;
    }

    @Override
    public List<SalStdXmgzRate> toDomain(List<SalStdXmgzRateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdXmgzRate> list = new ArrayList<SalStdXmgzRate>( dtoList.size() );
        for ( SalStdXmgzRateDTO salStdXmgzRateDTO : dtoList ) {
            list.add( toDomain( salStdXmgzRateDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdXmgzRateDTO> toDto(List<SalStdXmgzRate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdXmgzRateDTO> list = new ArrayList<SalStdXmgzRateDTO>( entityList.size() );
        for ( SalStdXmgzRate salStdXmgzRate : entityList ) {
            list.add( toDto( salStdXmgzRate ) );
        }

        return list;
    }
}
