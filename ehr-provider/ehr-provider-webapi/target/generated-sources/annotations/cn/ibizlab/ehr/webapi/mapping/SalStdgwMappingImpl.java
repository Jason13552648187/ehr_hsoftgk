package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdgw;
import cn.ibizlab.ehr.webapi.dto.SalStdgwDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdgwMappingImpl implements SalStdgwMapping {

    @Override
    public SalStdgw toDomain(SalStdgwDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdgw salStdgw = new SalStdgw();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdgw.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdgw.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            salStdgw.setBz( dto.getBz() );
        }
        if ( dto.getJssj() != null ) {
            salStdgw.setJssj( dto.getJssj() );
        }
        if ( dto.getSalstdgwname() != null ) {
            salStdgw.setSalstdgwname( dto.getSalstdgwname() );
        }
        if ( dto.getQssj() != null ) {
            salStdgw.setQssj( dto.getQssj() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdgw.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdgw.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salStdgw.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSalstdgwid() != null ) {
            salStdgw.setSalstdgwid( dto.getSalstdgwid() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdgw.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            salStdgw.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdgw.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdgw.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdgw;
    }

    @Override
    public SalStdgwDTO toDto(SalStdgw entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdgwDTO salStdgwDTO = new SalStdgwDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdgwDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdgwDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            salStdgwDTO.setBz( entity.getBz() );
        }
        if ( entity.getJssj() != null ) {
            salStdgwDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getSalstdgwname() != null ) {
            salStdgwDTO.setSalstdgwname( entity.getSalstdgwname() );
        }
        if ( entity.getQssj() != null ) {
            salStdgwDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdgwDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdgwDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salStdgwDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSalstdgwid() != null ) {
            salStdgwDTO.setSalstdgwid( entity.getSalstdgwid() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdgwDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            salStdgwDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdgwDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdgwDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdgwDTO;
    }

    @Override
    public List<SalStdgw> toDomain(List<SalStdgwDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdgw> list = new ArrayList<SalStdgw>( dtoList.size() );
        for ( SalStdgwDTO salStdgwDTO : dtoList ) {
            list.add( toDomain( salStdgwDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdgwDTO> toDto(List<SalStdgw> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdgwDTO> list = new ArrayList<SalStdgwDTO>( entityList.size() );
        for ( SalStdgw salStdgw : entityList ) {
            list.add( toDto( salStdgw ) );
        }

        return list;
    }
}
