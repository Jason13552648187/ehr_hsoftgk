package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdGwGzrate;
import cn.ibizlab.ehr.webapi.dto.SalStdGwGzrateDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdGwGzrateMappingImpl implements SalStdGwGzrateMapping {

    @Override
    public SalStdGwGzrate toDomain(SalStdGwGzrateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdGwGzrate salStdGwGzrate = new SalStdGwGzrate();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdGwGzrate.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdGwGzrate.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhjl() != null ) {
            salStdGwGzrate.setKhjl( dto.getKhjl() );
        }
        if ( dto.getSalstdgwgzratename() != null ) {
            salStdGwGzrate.setSalstdgwgzratename( dto.getSalstdgwgzratename() );
        }
        if ( dto.getJxgzbl() != null ) {
            salStdGwGzrate.setJxgzbl( dto.getJxgzbl() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdGwGzrate.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            salStdGwGzrate.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSalstdgwgzrateid() != null ) {
            salStdGwGzrate.setSalstdgwgzrateid( dto.getSalstdgwgzrateid() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdGwGzrate.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            salStdGwGzrate.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdGwGzrate.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdGwGzrate.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdGwGzrate.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdGwGzrate;
    }

    @Override
    public SalStdGwGzrateDTO toDto(SalStdGwGzrate entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdGwGzrateDTO salStdGwGzrateDTO = new SalStdGwGzrateDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdGwGzrateDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdGwGzrateDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhjl() != null ) {
            salStdGwGzrateDTO.setKhjl( entity.getKhjl() );
        }
        if ( entity.getSalstdgwgzratename() != null ) {
            salStdGwGzrateDTO.setSalstdgwgzratename( entity.getSalstdgwgzratename() );
        }
        if ( entity.getJxgzbl() != null ) {
            salStdGwGzrateDTO.setJxgzbl( entity.getJxgzbl() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdGwGzrateDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            salStdGwGzrateDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSalstdgwgzrateid() != null ) {
            salStdGwGzrateDTO.setSalstdgwgzrateid( entity.getSalstdgwgzrateid() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdGwGzrateDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            salStdGwGzrateDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdGwGzrateDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdGwGzrateDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdGwGzrateDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdGwGzrateDTO;
    }

    @Override
    public List<SalStdGwGzrate> toDomain(List<SalStdGwGzrateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdGwGzrate> list = new ArrayList<SalStdGwGzrate>( dtoList.size() );
        for ( SalStdGwGzrateDTO salStdGwGzrateDTO : dtoList ) {
            list.add( toDomain( salStdGwGzrateDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdGwGzrateDTO> toDto(List<SalStdGwGzrate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdGwGzrateDTO> list = new ArrayList<SalStdGwGzrateDTO>( entityList.size() );
        for ( SalStdGwGzrate salStdGwGzrate : entityList ) {
            list.add( toDto( salStdGwGzrate ) );
        }

        return list;
    }
}
