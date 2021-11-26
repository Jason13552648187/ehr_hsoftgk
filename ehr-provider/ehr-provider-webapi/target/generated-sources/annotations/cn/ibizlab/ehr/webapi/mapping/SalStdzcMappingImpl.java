package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdzc;
import cn.ibizlab.ehr.webapi.dto.SalStdzcDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdzcMappingImpl implements SalStdzcMapping {

    @Override
    public SalStdzc toDomain(SalStdzcDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdzc salStdzc = new SalStdzc();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdzc.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdzc.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            salStdzc.setBz( dto.getBz() );
        }
        if ( dto.getSalstdzcname() != null ) {
            salStdzc.setSalstdzcname( dto.getSalstdzcname() );
        }
        if ( dto.getZcdj() != null ) {
            salStdzc.setZcdj( dto.getZcdj() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdzc.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdzc.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdzc.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            salStdzc.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            salStdzc.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdzc.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalstdzcid() != null ) {
            salStdzc.setSalstdzcid( dto.getSalstdzcid() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdzc.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdzc;
    }

    @Override
    public SalStdzcDTO toDto(SalStdzc entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdzcDTO salStdzcDTO = new SalStdzcDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdzcDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdzcDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            salStdzcDTO.setBz( entity.getBz() );
        }
        if ( entity.getSalstdzcname() != null ) {
            salStdzcDTO.setSalstdzcname( entity.getSalstdzcname() );
        }
        if ( entity.getZcdj() != null ) {
            salStdzcDTO.setZcdj( entity.getZcdj() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdzcDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdzcDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdzcDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            salStdzcDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            salStdzcDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdzcDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalstdzcid() != null ) {
            salStdzcDTO.setSalstdzcid( entity.getSalstdzcid() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdzcDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdzcDTO;
    }

    @Override
    public List<SalStdzc> toDomain(List<SalStdzcDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdzc> list = new ArrayList<SalStdzc>( dtoList.size() );
        for ( SalStdzcDTO salStdzcDTO : dtoList ) {
            list.add( toDomain( salStdzcDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdzcDTO> toDto(List<SalStdzc> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdzcDTO> list = new ArrayList<SalStdzcDTO>( entityList.size() );
        for ( SalStdzc salStdzc : entityList ) {
            list.add( toDto( salStdzc ) );
        }

        return list;
    }
}
