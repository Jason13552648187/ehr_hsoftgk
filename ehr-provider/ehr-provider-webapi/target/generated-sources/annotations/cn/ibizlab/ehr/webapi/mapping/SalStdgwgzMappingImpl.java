package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdgwgz;
import cn.ibizlab.ehr.webapi.dto.SalStdgwgzDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdgwgzMappingImpl implements SalStdgwgzMapping {

    @Override
    public SalStdgwgz toDomain(SalStdgwgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdgwgz salStdgwgz = new SalStdgwgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdgwgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdgwgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJbgzbl() != null ) {
            salStdgwgz.setJbgzbl( dto.getJbgzbl() );
        }
        if ( dto.getBz() != null ) {
            salStdgwgz.setBz( dto.getBz() );
        }
        if ( dto.getDj() != null ) {
            salStdgwgz.setDj( dto.getDj() );
        }
        if ( dto.getSalstdgwgzname() != null ) {
            salStdgwgz.setSalstdgwgzname( dto.getSalstdgwgzname() );
        }
        if ( dto.getJxgzbl() != null ) {
            salStdgwgz.setJxgzbl( dto.getJxgzbl() );
        }
        if ( dto.getOrmdutyid() != null ) {
            salStdgwgz.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdgwgz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getEnable() != null ) {
            salStdgwgz.setEnable( dto.getEnable() );
        }
        if ( dto.getSalstdgwgzid() != null ) {
            salStdgwgz.setSalstdgwgzid( dto.getSalstdgwgzid() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdgwgz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salStdgwgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdgwgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdgwgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdgwgz.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            salStdgwgz.setOrmdutyname( dto.getOrmdutyname() );
        }

        return salStdgwgz;
    }

    @Override
    public SalStdgwgzDTO toDto(SalStdgwgz entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdgwgzDTO salStdgwgzDTO = new SalStdgwgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdgwgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdgwgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJbgzbl() != null ) {
            salStdgwgzDTO.setJbgzbl( entity.getJbgzbl() );
        }
        if ( entity.getBz() != null ) {
            salStdgwgzDTO.setBz( entity.getBz() );
        }
        if ( entity.getDj() != null ) {
            salStdgwgzDTO.setDj( entity.getDj() );
        }
        if ( entity.getSalstdgwgzname() != null ) {
            salStdgwgzDTO.setSalstdgwgzname( entity.getSalstdgwgzname() );
        }
        if ( entity.getJxgzbl() != null ) {
            salStdgwgzDTO.setJxgzbl( entity.getJxgzbl() );
        }
        if ( entity.getOrmdutyid() != null ) {
            salStdgwgzDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdgwgzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getEnable() != null ) {
            salStdgwgzDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSalstdgwgzid() != null ) {
            salStdgwgzDTO.setSalstdgwgzid( entity.getSalstdgwgzid() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdgwgzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salStdgwgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdgwgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdgwgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdgwgzDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            salStdgwgzDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return salStdgwgzDTO;
    }

    @Override
    public List<SalStdgwgz> toDomain(List<SalStdgwgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdgwgz> list = new ArrayList<SalStdgwgz>( dtoList.size() );
        for ( SalStdgwgzDTO salStdgwgzDTO : dtoList ) {
            list.add( toDomain( salStdgwgzDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdgwgzDTO> toDto(List<SalStdgwgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdgwgzDTO> list = new ArrayList<SalStdgwgzDTO>( entityList.size() );
        for ( SalStdgwgz salStdgwgz : entityList ) {
            list.add( toDto( salStdgwgz ) );
        }

        return list;
    }
}
