package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSalaryDetail;
import cn.ibizlab.ehr.webapi.dto.SalSalaryDetailDTO;
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
public class SalSalaryDetailMappingImpl implements SalSalaryDetailMapping {

    @Override
    public SalSalaryDetail toDomain(SalSalaryDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSalaryDetail salSalaryDetail = new SalSalaryDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSalaryDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSalaryDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalsalarydetailname() != null ) {
            salSalaryDetail.setSalsalarydetailname( dto.getSalsalarydetailname() );
        }
        if ( dto.getYwz() != null ) {
            salSalaryDetail.setYwz( dto.getYwz() );
        }
        if ( dto.getYwms() != null ) {
            salSalaryDetail.setYwms( dto.getYwms() );
        }
        if ( dto.getXc() != null ) {
            salSalaryDetail.setXc( dto.getXc() );
        }
        if ( dto.getSalschemeitemid() != null ) {
            salSalaryDetail.setSalschemeitemid( dto.getSalschemeitemid() );
        }
        if ( dto.getSalsalaryid() != null ) {
            salSalaryDetail.setSalsalaryid( dto.getSalsalaryid() );
        }
        if ( dto.getUpdateman() != null ) {
            salSalaryDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalsalarydetailid() != null ) {
            salSalaryDetail.setSalsalarydetailid( dto.getSalsalarydetailid() );
        }
        if ( dto.getEnable() != null ) {
            salSalaryDetail.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            salSalaryDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSalaryDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            salSalaryDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalsalaryname() != null ) {
            salSalaryDetail.setSalsalaryname( dto.getSalsalaryname() );
        }
        if ( dto.getSalschemeitemname() != null ) {
            salSalaryDetail.setSalschemeitemname( dto.getSalschemeitemname() );
        }

        return salSalaryDetail;
    }

    @Override
    public SalSalaryDetailDTO toDto(SalSalaryDetail entity) {
        if ( entity == null ) {
            return null;
        }

        SalSalaryDetailDTO salSalaryDetailDTO = new SalSalaryDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSalaryDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSalaryDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalsalarydetailname() != null ) {
            salSalaryDetailDTO.setSalsalarydetailname( entity.getSalsalarydetailname() );
        }
        if ( entity.getYwz() != null ) {
            salSalaryDetailDTO.setYwz( entity.getYwz() );
        }
        if ( entity.getYwms() != null ) {
            salSalaryDetailDTO.setYwms( entity.getYwms() );
        }
        if ( entity.getXc() != null ) {
            salSalaryDetailDTO.setXc( entity.getXc() );
        }
        if ( entity.getSalschemeitemid() != null ) {
            salSalaryDetailDTO.setSalschemeitemid( entity.getSalschemeitemid() );
        }
        if ( entity.getSalsalaryid() != null ) {
            salSalaryDetailDTO.setSalsalaryid( entity.getSalsalaryid() );
        }
        if ( entity.getUpdateman() != null ) {
            salSalaryDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalsalarydetailid() != null ) {
            salSalaryDetailDTO.setSalsalarydetailid( entity.getSalsalarydetailid() );
        }
        if ( entity.getEnable() != null ) {
            salSalaryDetailDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            salSalaryDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSalaryDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            salSalaryDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalsalaryname() != null ) {
            salSalaryDetailDTO.setSalsalaryname( entity.getSalsalaryname() );
        }
        if ( entity.getSalschemeitemname() != null ) {
            salSalaryDetailDTO.setSalschemeitemname( entity.getSalschemeitemname() );
        }

        return salSalaryDetailDTO;
    }

    @Override
    public List<SalSalaryDetail> toDomain(List<SalSalaryDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSalaryDetail> list = new ArrayList<SalSalaryDetail>( dtoList.size() );
        for ( SalSalaryDetailDTO salSalaryDetailDTO : dtoList ) {
            list.add( toDomain( salSalaryDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSalaryDetailDTO> toDto(List<SalSalaryDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSalaryDetailDTO> list = new ArrayList<SalSalaryDetailDTO>( entityList.size() );
        for ( SalSalaryDetail salSalaryDetail : entityList ) {
            list.add( toDto( salSalaryDetail ) );
        }

        return list;
    }
}
