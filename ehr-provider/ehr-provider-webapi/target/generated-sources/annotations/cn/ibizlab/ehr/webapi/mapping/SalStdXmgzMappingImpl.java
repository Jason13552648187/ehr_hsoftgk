package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdXmgz;
import cn.ibizlab.ehr.webapi.dto.SalStdXmgzDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdXmgzMappingImpl implements SalStdXmgzMapping {

    @Override
    public SalStdXmgz toDomain(SalStdXmgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdXmgz salStdXmgz = new SalStdXmgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdXmgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdXmgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDj() != null ) {
            salStdXmgz.setDj( dto.getDj() );
        }
        if ( dto.getBz() != null ) {
            salStdXmgz.setBz( dto.getBz() );
        }
        if ( dto.getXmjb() != null ) {
            salStdXmgz.setXmjb( dto.getXmjb() );
        }
        if ( dto.getSalstdxmgzname() != null ) {
            salStdXmgz.setSalstdxmgzname( dto.getSalstdxmgzname() );
        }
        if ( dto.getJxgzbl() != null ) {
            salStdXmgz.setJxgzbl( dto.getJxgzbl() );
        }
        if ( dto.getJbgzbl() != null ) {
            salStdXmgz.setJbgzbl( dto.getJbgzbl() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdXmgz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            salStdXmgz.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdXmgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalstdxmgzid() != null ) {
            salStdXmgz.setSalstdxmgzid( dto.getSalstdxmgzid() );
        }
        if ( dto.getCreateman() != null ) {
            salStdXmgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            salStdXmgz.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdXmgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdXmgz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmdutyname() != null ) {
            salStdXmgz.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdXmgz.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdXmgz;
    }

    @Override
    public SalStdXmgzDTO toDto(SalStdXmgz entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdXmgzDTO salStdXmgzDTO = new SalStdXmgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdXmgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdXmgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDj() != null ) {
            salStdXmgzDTO.setDj( entity.getDj() );
        }
        if ( entity.getBz() != null ) {
            salStdXmgzDTO.setBz( entity.getBz() );
        }
        if ( entity.getXmjb() != null ) {
            salStdXmgzDTO.setXmjb( entity.getXmjb() );
        }
        if ( entity.getSalstdxmgzname() != null ) {
            salStdXmgzDTO.setSalstdxmgzname( entity.getSalstdxmgzname() );
        }
        if ( entity.getJxgzbl() != null ) {
            salStdXmgzDTO.setJxgzbl( entity.getJxgzbl() );
        }
        if ( entity.getJbgzbl() != null ) {
            salStdXmgzDTO.setJbgzbl( entity.getJbgzbl() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdXmgzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            salStdXmgzDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdXmgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalstdxmgzid() != null ) {
            salStdXmgzDTO.setSalstdxmgzid( entity.getSalstdxmgzid() );
        }
        if ( entity.getCreateman() != null ) {
            salStdXmgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            salStdXmgzDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdXmgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdXmgzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmdutyname() != null ) {
            salStdXmgzDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdXmgzDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdXmgzDTO;
    }

    @Override
    public List<SalStdXmgz> toDomain(List<SalStdXmgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdXmgz> list = new ArrayList<SalStdXmgz>( dtoList.size() );
        for ( SalStdXmgzDTO salStdXmgzDTO : dtoList ) {
            list.add( toDomain( salStdXmgzDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdXmgzDTO> toDto(List<SalStdXmgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdXmgzDTO> list = new ArrayList<SalStdXmgzDTO>( entityList.size() );
        for ( SalStdXmgz salStdXmgz : entityList ) {
            list.add( toDto( salStdXmgz ) );
        }

        return list;
    }
}
