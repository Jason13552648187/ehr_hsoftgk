package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalRuleDetail;
import cn.ibizlab.ehr.webapi.dto.SalRuleDetailDTO;
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
public class SalRuleDetailMappingImpl implements SalRuleDetailMapping {

    @Override
    public SalRuleDetail toDomain(SalRuleDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalRuleDetail salRuleDetail = new SalRuleDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salRuleDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salRuleDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalruledetailname() != null ) {
            salRuleDetail.setSalruledetailname( dto.getSalruledetailname() );
        }
        if ( dto.getCheckrule() != null ) {
            salRuleDetail.setCheckrule( dto.getCheckrule() );
        }
        if ( dto.getSalparamid() != null ) {
            salRuleDetail.setSalparamid( dto.getSalparamid() );
        }
        if ( dto.getSalruleid() != null ) {
            salRuleDetail.setSalruleid( dto.getSalruleid() );
        }
        if ( dto.getSalparamid2() != null ) {
            salRuleDetail.setSalparamid2( dto.getSalparamid2() );
        }
        if ( dto.getCreateman() != null ) {
            salRuleDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salRuleDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salRuleDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalruledetailid() != null ) {
            salRuleDetail.setSalruledetailid( dto.getSalruledetailid() );
        }
        if ( dto.getCreatedate() != null ) {
            salRuleDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalrulename() != null ) {
            salRuleDetail.setSalrulename( dto.getSalrulename() );
        }
        if ( dto.getSalparamname() != null ) {
            salRuleDetail.setSalparamname( dto.getSalparamname() );
        }
        if ( dto.getSalparamname2() != null ) {
            salRuleDetail.setSalparamname2( dto.getSalparamname2() );
        }

        return salRuleDetail;
    }

    @Override
    public SalRuleDetailDTO toDto(SalRuleDetail entity) {
        if ( entity == null ) {
            return null;
        }

        SalRuleDetailDTO salRuleDetailDTO = new SalRuleDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salRuleDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salRuleDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalruledetailname() != null ) {
            salRuleDetailDTO.setSalruledetailname( entity.getSalruledetailname() );
        }
        if ( entity.getCheckrule() != null ) {
            salRuleDetailDTO.setCheckrule( entity.getCheckrule() );
        }
        if ( entity.getSalparamid() != null ) {
            salRuleDetailDTO.setSalparamid( entity.getSalparamid() );
        }
        if ( entity.getSalruleid() != null ) {
            salRuleDetailDTO.setSalruleid( entity.getSalruleid() );
        }
        if ( entity.getSalparamid2() != null ) {
            salRuleDetailDTO.setSalparamid2( entity.getSalparamid2() );
        }
        if ( entity.getCreateman() != null ) {
            salRuleDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salRuleDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salRuleDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalruledetailid() != null ) {
            salRuleDetailDTO.setSalruledetailid( entity.getSalruledetailid() );
        }
        if ( entity.getCreatedate() != null ) {
            salRuleDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalrulename() != null ) {
            salRuleDetailDTO.setSalrulename( entity.getSalrulename() );
        }
        if ( entity.getSalparamname() != null ) {
            salRuleDetailDTO.setSalparamname( entity.getSalparamname() );
        }
        if ( entity.getSalparamname2() != null ) {
            salRuleDetailDTO.setSalparamname2( entity.getSalparamname2() );
        }

        return salRuleDetailDTO;
    }

    @Override
    public List<SalRuleDetail> toDomain(List<SalRuleDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalRuleDetail> list = new ArrayList<SalRuleDetail>( dtoList.size() );
        for ( SalRuleDetailDTO salRuleDetailDTO : dtoList ) {
            list.add( toDomain( salRuleDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<SalRuleDetailDTO> toDto(List<SalRuleDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalRuleDetailDTO> list = new ArrayList<SalRuleDetailDTO>( entityList.size() );
        for ( SalRuleDetail salRuleDetail : entityList ) {
            list.add( toDto( salRuleDetail ) );
        }

        return list;
    }
}
